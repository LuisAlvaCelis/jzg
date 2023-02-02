package mysql.vouchers;

import addons.ExtraCode;
import addons.RendererTable;
import addons.TableModeler;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import model.vouchers.VouchersModel;
import mysql.ConnectionMySQL;

public class DAOVouchers implements IVouchers{
    
    private ConnectionMySQL connection;
    private VouchersModel model;

    public DAOVouchers(){
        this.connection=new ConnectionMySQL();
        this.model=new VouchersModel();
    }
    
    public DAOVouchers(VouchersModel model){
        this.connection=new ConnectionMySQL();
        this.model=model;
    }
    
    public void setModel(VouchersModel model){
        this.model=model;
    }
    
    @Override
    public boolean insert() {
        boolean status=false;
        String url="INSERT INTO vouchers(code,customer,image,register_date) VALUES(?,?,?,?)";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setString(1, model.getCode());
            ps.setString(2, model.getCustomer());
            ps.setBinaryStream(3, model.getVoucherFis());
            ps.setTimestamp(4, new Timestamp(model.getRegisterDate().getTime()));
            if (ps.executeUpdate() > 0) {
                status = true;
            }
            ps.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return status;
    }

    @Override
    public boolean delete() {
        boolean status=false;
        String url="DELETE FROM vouchers WHERE id=?";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setInt(1, model.getId());
            if (ps.executeUpdate() > 0) {
                status = true;
            }
            ps.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return status;
    }

    @Override
    public ArrayList<VouchersModel> select(String search) {
        ArrayList<VouchersModel> list=new ArrayList<>();
        String url_size="SELECT count(*) as contador FROM vouchers WHERE CONCAT(id,' ', code,' ',customer) LIKE '%"+search+"%'";
        try {
            Statement statement = connection.openConnnection().createStatement(); 
            ResultSet rs = statement.executeQuery(url_size);
            rs.next();
            int contador=rs.getInt("contador");
            if(contador>100){
                String url="SELECT * FROM vouchers WHERE CONCAT(id,' ', code,' ',customer) LIKE '%"+search+"%' LIMIT 100";
                rs=statement.executeQuery(url);
                while(rs.next()){
                    Blob b = rs.getBlob(4);
                    byte[] data = b.getBytes(1L, (int) b.length());
                    BufferedImage bi = ImageIO.read(new ByteArrayInputStream(data));
                    ImageIcon imageicon = new ImageIcon(bi);
                    list.add(new VouchersModel(rs.getInt(1), rs.getString(2), rs.getString(3), imageicon, rs.getTimestamp(5)));
                }
                rs.close();
                statement.close();
            }else{
                String url="SELECT * FROM vouchers WHERE CONCAT(id,' ', code,' ',customer) LIKE '%"+search+"%'";
                rs=statement.executeQuery(url);
                while(rs.next()){
                    Blob b = rs.getBlob(4);
                    byte[] data = b.getBytes(1L, (int) b.length());
                    BufferedImage bi = ImageIO.read(new ByteArrayInputStream(data));
                    ImageIcon imageicon = new ImageIcon(bi);
                    list.add(new VouchersModel(rs.getInt(1), rs.getString(2), rs.getString(3), imageicon, rs.getTimestamp(5)));
                }
                rs.close();
                statement.close();
            }
        }catch (IOException | SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return list;
    }

    @Override
    public VouchersModel selectSpecificID(int id) {
        VouchersModel aux=null;
        String url="SELECT * FROM vouchers WHERE id="+id;
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            while(rs.next()){
                Blob b = rs.getBlob(4);
                byte[] data = b.getBytes(1L, (int) b.length());
                BufferedImage bi = ImageIO.read(new ByteArrayInputStream(data));
                ImageIcon imageicon = new ImageIcon(bi);
                aux=new VouchersModel(rs.getInt(1), rs.getString(2), rs.getString(3), imageicon, rs.getTimestamp(5));
            }
            rs.close();
            statement.close();
        }catch (IOException | SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return aux;
    }

    public void model(JTable table){
        table.setModel(createTableModeler());
        table.setDefaultRenderer(Object.class, new RendererTable());
    }
    
    private TableModel createTableModeler(){
        return new TableModeler<VouchersModel>(){
            @Override
            public Object getValueAt(VouchersModel t, int column) {
                JButton btnShow=new JButton("Mostrar imagen");
                JButton btnDelete=new JButton("Eliminar");
                switch (column) {
                    case 0 -> {
                        return t.getId();
                    }
                    case 1 -> {
                        return t.getCode();
                    }
                    case 2 -> {
                        return t.getCustomer();
                    }
                    case 3 -> {
                        return ExtraCode.convertDateFormat(t.getRegisterDate(), "dd/MM/yyyy hh:mm:ss aa");
                    }
                    case 4 -> {
                        btnShow.setName(String.valueOf(t.getId()));
                        return btnShow;
                    }
                    case 5 -> {
                        btnDelete.setName(String.valueOf(t.getId()));
                        return btnDelete;
                    }
                }
                return null;
            }

            @Override
            public String getColumnName(int column) {
                switch (column) {
                    case 0 -> {
                        return "ID";
                    }
                    case 1 -> {
                        return "CODIGO";
                    }
                    case 2 -> {
                        return "CLIENTE";
                    }
                    case 3 -> {
                        return "FECHA DE REGISTRO";
                    }
                    case 4 -> {
                        return "IMAGEN";
                    }
                    case 5 -> {
                        return "ELIMINAR";
                    }
                }
                return null;
            }

            @Override
            public int getColumnCount() {
                return 6;
            }
            
        };
    }
}
