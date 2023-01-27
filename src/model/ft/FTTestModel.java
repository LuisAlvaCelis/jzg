package model.ft;

import java.util.Date;

public class FTTestModel {
    
    private int id;
    private String name;
    private String details;
    private Date registerDate;
    private Date updateDate;

    public FTTestModel(int id, String name, String details, Date registerDate,Date updateDate) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.registerDate = registerDate;
        this.updateDate=updateDate;
    }

    public FTTestModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
    
    public Date getUpdateDate(){
        return updateDate;
    }
    
    public void setUpdateDate(Date updateDate){
        this.updateDate=updateDate;
    }
}
