package mysql.svc;

import model.svc.SVCModel;

public interface IValidatedEmails {
    
    public boolean insert();
    public SVCModel selectSpecificEmail(String email);
}
