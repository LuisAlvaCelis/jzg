package mysql.svc;

import java.sql.*;
import model.svc.SVCModel;
import mysql.ConnectionMySQL;

public class DAOValidatedEmails implements IValidatedEmails{
    
    private final ConnectionMySQL connection;
    private SVCModel model;
    
    public DAOValidatedEmails(SVCModel model){
        this.model=model;
        this.connection=new ConnectionMySQL();
    }
    
    public DAOValidatedEmails(){
        this.connection=new ConnectionMySQL();
    }
    
    public void setModel(SVCModel model){
        this.model=model;
    }
    
    @Override
    public boolean insert() {
        boolean status=false;
        String url="INSERT INTO validated_emails(dni,email,validation_status,register_date) VALUES(?,?,?,?)";
        try (PreparedStatement ps = connection.openConnnection().prepareStatement(url)) {
            ps.setString(1, model.getDni());
            ps.setString(2, model.getEmail());
            ps.setBoolean(3, model.isValidationStatus());
            ps.setTimestamp(4, new Timestamp(model.getRegisterDate().getTime()));
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
    public SVCModel selectSpecificEmail(String email) {
        SVCModel aux=null;
        String url="SELECT * FROM validated_emails WHERE email='"+email+"'";
        try (Statement statement = connection.openConnnection().createStatement(); ResultSet rs = statement.executeQuery(url)) {
            if(rs.next()){
                aux=new SVCModel(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getBoolean(4), rs.getTimestamp(5));
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
