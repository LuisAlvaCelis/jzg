package mysql.ft;

import addons.ExtraCode;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ft.FTTestModel;
import mysql.ConnectionMySQL;

public class DAOTest implements IFTTest{
    
    private final ConnectionMySQL connection;
    public FTTestModel model;
    
    public DAOTest(FTTestModel model){
        this.connection=new ConnectionMySQL();
        this.model=model;
    }
    
    public DAOTest(){
        this.connection=new ConnectionMySQL();
    }
    
    public void setModel(FTTestModel model){
        this.model=model;
    }

    @Override
    public boolean insert() {
        boolean status=false;
        String url="INSERT INTO fingering_test(name,details,register_date,update_date,minutes,seconds) VALUES(?,?,?,?,?,?)";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setString(1, model.getName());
            ps.setString(2, model.getDetails());
            ps.setTimestamp(3, new Timestamp(model.getRegisterDate().getTime()));
            ps.setTimestamp(4, null);
            ps.setInt(5, model.getMinutes());
            ps.setInt(6, model.getSeconds());
            int result=ps.executeUpdate();
            if(result>0){
                status=true;
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return status;
    }

    @Override
    public boolean update() {
        boolean status=false;
        String url="UPDATE fingering_test SET name=?, details=?, update_date=?,minutes=?,seconds=? WHERE id=?";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setString(1, model.getName());
            ps.setString(2, model.getDetails());
            ps.setTimestamp(3, new Timestamp(model.getUpdateDate().getTime()));
            ps.setInt(4, model.getMinutes());
            ps.setInt(5, model.getSeconds());
            ps.setInt(6,model.getId());
            int result=ps.executeUpdate();
            if(result>0){
                status=true;
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return status;
    }

    @Override
    public ArrayList<FTTestModel> select() {
        ArrayList<FTTestModel> list=new ArrayList<>();
        String url="SELECT * FROM fingering_test";
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            while(rs.next()){
                list.add(new FTTestModel(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getTimestamp(4), rs.getTimestamp(5),rs.getInt(6),rs.getInt(7)));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return list;
    }

    @Override
    public FTTestModel selectSpecificID(int id) {
        FTTestModel aux=new FTTestModel();
        String url="SELECT * FROM fingering_test WHERE id="+id;
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            if(rs.next()){
                aux=new FTTestModel(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getTimestamp(4), rs.getTimestamp(5),rs.getInt(6),rs.getInt(7));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return aux;
    }

    @Override
    public FTTestModel selectSpecificName(String name) {
        FTTestModel aux=new FTTestModel();
        String url="SELECT * FROM fingering_test WHERE name='"+name+"'";
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            if(rs.next()){
                aux=new FTTestModel(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getTimestamp(4), rs.getTimestamp(5),rs.getInt(6),rs.getInt(7));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return aux;
    }
    
    @Override
    public boolean delete() {
        boolean status=false;
        String url="DELETE FROM fingering_test WHERE id=?";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setInt(1, model.getId());
            int result=ps.executeUpdate();
            if(result>0){
                status=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return status;
    }
    
    public void writeTable(JTable table,String search){
        Object[] rows=new Object[table.getModel().getColumnCount()];
        DefaultTableModel dtm=ExtraCode.getDefaultTableModel(table);
        JButton btnDelete=new JButton("Eliminar");
        JButton btnUpdate=new JButton("Modificar");
        for(FTTestModel aux:select()){
            if(search==null){
                rows[0]=aux.getId();
                rows[1]=aux.getName();
                rows[2]=(aux.getUpdateDate()!=null)?ExtraCode.convertDateFormat(aux.getUpdateDate(), "dd/MM/yyyy hh:mm:ss aa"):"No se detecta actualización";
                rows[3]=btnUpdate;
                rows[4]=btnDelete;
                dtm.addRow(rows);
            }else if(aux.getName().contains(search)){
                rows[0]=aux.getId();
                rows[1]=aux.getName();
                rows[2]=(aux.getUpdateDate()!=null)?ExtraCode.convertDateFormat(aux.getUpdateDate(), "dd/MM/yyyy hh:mm:ss aa"):"No se detecta actualización";
                rows[3]=btnUpdate;
                rows[4]=btnDelete;
                dtm.addRow(rows);
            }
        }
        dtm.fireTableStructureChanged();
        table.setModel(dtm);
    }
}
