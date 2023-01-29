package model.ft;

import java.util.Date;

public class FTTestModel {
    
    private int id;
    private String name;
    private String details;
    private Date registerDate;
    private Date updateDate;
    private int minutes;
    private int seconds;

    public FTTestModel(int id, String name, String details, Date registerDate,Date updateDate,int minutes,int seconds) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.registerDate = registerDate;
        this.updateDate=updateDate;
        this.minutes=minutes;
        this.seconds=seconds;
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

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
