package mysql.ft;

import java.sql.*;
import java.util.ArrayList;
import model.ft.FTPersonalModel;
import mysql.ConnectionMySQL;

public class DAOPersonalTest implements IPersonalTest{
    
    private final ConnectionMySQL connection;
    private FTPersonalModel model;
    
    public DAOPersonalTest(FTPersonalModel model){
        this.model=model;
        this.connection=new ConnectionMySQL();
    }
    
    public DAOPersonalTest(){
        this.connection=new ConnectionMySQL();
    }
    
    public void setModel(FTPersonalModel model){
        this.model=model;
    }

    @Override
    public boolean insert() {
        boolean status=false;
        String url="INSERT INTO personal_ft(dni,name,time_start,time_end) VALUES(?,?,?,?)";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setString(1, model.getDni());
            ps.setString(2, model.getName());
            ps.setTimestamp(3, new Timestamp(model.getTimeStart().getTime()));
            ps.setTimestamp(4, null);
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
    public boolean delete() {
        boolean status=false;
        String url="DELETE FROM personal_ft WHERE id=?";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setInt(1, model.getId());
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
        String url="UPDATE personal_ft SET dni=?,name=?,time_start=?,time_end=? WHERE id=?";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setString(1, model.getDni());
            ps.setString(2, model.getName());
            ps.setTimestamp(3, new Timestamp(model.getTimeStart().getTime()));
            ps.setTimestamp(4, new Timestamp(model.getTimeEnd().getTime()));
            ps.setInt(5, model.getId());
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
    public ArrayList<FTPersonalModel> select() {
        ArrayList<FTPersonalModel> list=new ArrayList<>();
        String url="SELECT * FROM personal_ft";
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            while(rs.next()){
                list.add(new FTPersonalModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4), rs.getTimestamp(5)));
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
    public FTPersonalModel selectSpecificID(int id) {
        FTPersonalModel aux=new FTPersonalModel();
        String url="SELECT * FROM personal_ft WHERE id="+id;
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            if(rs.next()){
                aux=new FTPersonalModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4), rs.getTimestamp(5));
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
    public FTPersonalModel selectSpecificDNI(String dni) {
        FTPersonalModel aux=new FTPersonalModel();
        String url="SELECT * FROM personal_ft WHERE id='"+dni+"'";
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            if(rs.next()){
                aux=new FTPersonalModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4), rs.getTimestamp(5));
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
    
}
