package model;

import files.FileClass;

public class ConnectionModel extends FileClass{
    
    private String ip;
    private String port;
    private String database;
    private String username;
    private String password;
    private boolean status;

    public ConnectionModel() {
        super();
        this.ip = getConfigFile().getString("MySQL.ip");
        this.port = getConfigFile().getString("MySQL.port");
        this.database = getConfigFile().getString("MySQL.database");
        this.username = getConfigFile().getString("MySQL.username");
        this.password = getConfigFile().getString("MySQL.password");
        this.status = getConfigFile().getBoolean("MySQL.status");
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}