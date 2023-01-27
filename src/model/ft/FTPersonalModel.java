package model.ft;

import java.util.Date;

public class FTPersonalModel {
    
    private int id;
    private String dni;
    private String name;
    private Date timeStart;
    private Date timeEnd;

    public FTPersonalModel(int id, String dni, String name, Date timeStart, Date timeEnd) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public FTPersonalModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }
}
