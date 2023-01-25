package mysql.emails;

import java.util.ArrayList;
import model.emails.EmailTemplateModel;

public interface IEmailTemplate {
    
    public boolean insert();
    public boolean update();
    public ArrayList select();
    public EmailTemplateModel selectSpecificID(int id);
    public EmailTemplateModel selectSpecificName(String name);
    public boolean delete();
}
