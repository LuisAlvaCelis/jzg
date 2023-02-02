package mysql.vouchers;

import java.util.ArrayList;
import model.vouchers.VouchersModel;

public interface IVouchers {
    
    public boolean insert();
    public boolean delete();
    public ArrayList<VouchersModel> select(String search);
    public VouchersModel selectSpecificID(int id);
}
