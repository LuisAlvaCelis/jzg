package model.ft;

import java.util.Date;

public class FTDetailPersonalModel {
    
    private int id;
    private int idPersonal;
    private int idTest;
    private Date timeStart;
    private Date timeEnd;
    private double percentageObtained;

    public FTDetailPersonalModel(int id, int idPersonal, int idTest, Date timeStart, Date timeEnd, double percentageObtained) {
        this.id = id;
        this.idPersonal = idPersonal;
        this.idTest = idTest;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.percentageObtained = percentageObtained;
    }

    public FTDetailPersonalModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
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

    public double getPercentageObtained() {
        return percentageObtained;
    }

    public void setPercentageObtained(double percentageObtained) {
        this.percentageObtained = percentageObtained;
    }
}
