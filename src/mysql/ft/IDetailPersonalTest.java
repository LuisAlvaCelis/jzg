package mysql.ft;

import java.util.ArrayList;
import model.ft.FTDetailPersonalModel;

public interface IDetailPersonalTest {
    
    public boolean insert();
    public boolean update();
    public boolean delete();
    public boolean deleteSpecificIDPersonal(int idPersonal);
    public ArrayList<FTDetailPersonalModel> select();
    public ArrayList<FTDetailPersonalModel> selectSpecificIDPersonal(int idPersonal);
    public FTDetailPersonalModel selectSpecificID(int id);
}
