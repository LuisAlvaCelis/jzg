package mysql;

import addons.ExtraCode;
import java.sql.*;
import model.ConnectionModel;

public class ConnectionMySQL extends ConnectionModel{
    
    private Connection connection;
    
    public ConnectionMySQL(){
       super();
    }
    
    public Connection openConnnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection=DriverManager.getConnection("jdbc:mysql://"+getIp()+":"+getPort()+"/"+getDatabase()+"?autoReconnect=true&useSSL=false",getUsername(),getPassword());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            ExtraCode.sendMessageError("Error: "+e.getLocalizedMessage());
        }
        return connection;
    }
    
    public void closeConnection(){
        try {
            if(!connection.isClosed()){
                this.connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            ExtraCode.sendMessageError("Error: "+e.getLocalizedMessage());
        }
    }
}
