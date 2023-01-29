package mysql.ft;

import java.sql.*;
import java.util.ArrayList;
import model.ft.FTDetailPersonalModel;
import mysql.ConnectionMySQL;

public class DAODetailPersonalTest implements IDetailPersonalTest{
    
    private ConnectionMySQL connection;
    private FTDetailPersonalModel model;
    
    public DAODetailPersonalTest(FTDetailPersonalModel model){
        this.connection=new ConnectionMySQL();
        this.model=model;
    }
    
    public DAODetailPersonalTest(){
        this.connection=new ConnectionMySQL();
    }
    
    public void setModel(FTDetailPersonalModel model){
        this.model=model;
    }

    @Override
    public boolean insert() {
        boolean status=false;
        String url="INSERT INTO details_personal_ft(id_personal,id_ft,time_start,time_end,percentage_obtained) VALUES(?,?,?,?,?)";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setInt(1, model.getIdPersonal());
            ps.setInt(2, model.getIdTest());
            ps.setTimestamp(3, new Timestamp(model.getTimeStart().getTime()));
            ps.setTimestamp(4, new Timestamp(model.getTimeEnd().getTime()));
            ps.setDouble(5, model.getPercentageObtained());
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
        String url="UPDATE details_personal_ft SET id_personal=?,id_ft=?,time_start=?,time_end=?,percentage_obtained=? WHERE id=?";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setInt(1, model.getIdPersonal());
            ps.setInt(2, model.getIdTest());
            ps.setTimestamp(3, new Timestamp(model.getTimeStart().getTime()));
            ps.setTimestamp(4, new Timestamp(model.getTimeEnd().getTime()));
            ps.setDouble(5, model.getPercentageObtained());
            ps.setInt(6, model.getId());
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
        String url="DELETE FROM details_personal_ft WHERE id=?";
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
    public ArrayList<FTDetailPersonalModel> select() {
        ArrayList<FTDetailPersonalModel> list=new ArrayList<>();
        String url="SELECT * FROM details_personal_ft";
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            while(rs.next()){
                list.add(new FTDetailPersonalModel(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getTimestamp(4), rs.getTimestamp(5), rs.getDouble(6)));
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
    public ArrayList<FTDetailPersonalModel> selectSpecificIDPersonal(int idPersonal) {
        ArrayList<FTDetailPersonalModel> list=new ArrayList<>();
        String url="SELECT * FROM details_personal_ft WHERE id_personal="+idPersonal;
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            while(rs.next()){
                list.add(new FTDetailPersonalModel(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getTimestamp(4), rs.getTimestamp(5), rs.getDouble(6)));
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
    public FTDetailPersonalModel selectSpecificID(int id) {
        FTDetailPersonalModel aux=new FTDetailPersonalModel();
        String url="SELECT * FROM details_personal_ft WHERE id_personal="+id;
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            if(rs.next()){
                aux=new FTDetailPersonalModel(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getTimestamp(4), rs.getTimestamp(5), rs.getDouble(6));
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
