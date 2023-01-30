package mysql.proposals;

import model.proposals.CustomerModel;
import mysql.ConnectionMySQL;
import java.sql.*;

public class DAOProposals implements IProposals{
    
    private final ConnectionMySQL connection;
    private CustomerModel model;
    
    public DAOProposals(){
        this.connection=new ConnectionMySQL();
        this.model=new CustomerModel();
    }

    @Override
    public CustomerModel select(String code_score) {
        this.model=null;
        String url="SELECT * FROM customer_proposals WHERE code_score='"+code_score+"'";
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            if(rs.next()){
                this.model=new CustomerModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8), rs.getInt(9), rs.getString(10));
            }
            rs.close();
            statement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return model;
    }

    @Override
    public boolean insert(String sql) {
        boolean status=false;
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(sql)) {
            int result=ps.executeUpdate();
            if(result>0){
                status=true;
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
    public boolean update(String sql) {
        boolean status=false;
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(sql)) {
            int result=ps.executeUpdate();
            if(result>0){
                status=true;
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
    public boolean delete(String sql) {
        boolean status=false;
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(sql)) {
            int result=ps.executeUpdate();
            if(result>0){
                status=true;
            }
            ps.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            this.connection.closeConnection();
        }
        return status;
    }
}
