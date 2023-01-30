package mysql.proposals;

import model.proposals.CustomerModel;

public interface IProposals {
    
    public CustomerModel select(String code_score);
    public boolean insert(String sql);
    public boolean update(String sql);
    public boolean delete(String sql);
}
