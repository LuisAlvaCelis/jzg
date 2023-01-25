package model.svc;

import java.util.Date;

public class SVCModel {
    
    private int id;
    private String dni;
    private String email;
    private boolean validationStatus;
    private Date registerDate;

    public SVCModel(int id, String dni, String email, boolean validationStatus, Date registerDate) {
        this.id = id;
        this.dni = dni;
        this.email = email;
        this.validationStatus = validationStatus;
        this.registerDate = registerDate;
    }

    public SVCModel() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(boolean validationStatus) {
        this.validationStatus = validationStatus;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
