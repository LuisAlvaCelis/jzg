package mysql.ft;

import java.util.ArrayList;
import model.ft.FTTestModel;

public interface IFTTest {
    
    public boolean insert();
    public boolean update();
    public ArrayList<FTTestModel> select();
    public FTTestModel selectSpecificID(int id);
    public FTTestModel selectSpecificName(String name);
}
