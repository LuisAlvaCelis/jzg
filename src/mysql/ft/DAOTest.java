package mysql.ft;

import java.sql.*;
import java.util.ArrayList;
import model.ft.FTTestModel;
import mysql.ConnectionMySQL;

public class DAOTest implements IFTTest{
    
    private ConnectionMySQL connection;
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
        String url="INSERT INTO fingering_test(name,details,register_date,update_date) VALUES(?,?,?,?)";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setString(1, model.getName());
            ps.setString(2, model.getDetails());
            ps.setTimestamp(3, new Timestamp(model.getRegisterDate().getTime()));
            ps.setTimestamp(4, null);
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

    @Override
    public boolean update() {
        boolean status=false;
        String url="UPDATE fingering_test SET name=?, details=?, update_date=? WHERE id=?";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setString(1, model.getName());
            ps.setString(2, model.getDetails());
            ps.setTimestamp(3, new Timestamp(model.getUpdateDate().getTime()));
            ps.setInt(4,model.getId());
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
        String url="SELECT * FROM email_test_account";
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            while(rs.next()){
                list.add(new FTTestModel(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getTimestamp(4), rs.getTimestamp(5)));
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public FTTestModel selectSpecificName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
