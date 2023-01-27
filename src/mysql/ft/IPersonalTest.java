package mysql.ft;

import java.util.ArrayList;
import model.ft.FTPersonalModel;

public interface IPersonalTest {
    
    public boolean insert();
    public boolean delete();
    public boolean update();
    public ArrayList<FTPersonalModel> select();
    public FTPersonalModel selectSpecificID(int id);
    public FTPersonalModel selectSpecificDNI(String dni);
}
