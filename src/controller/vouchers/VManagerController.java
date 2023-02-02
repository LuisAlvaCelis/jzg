package controller.vouchers;

import addons.IDataProvider;
import addons.TablePager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import model.vouchers.VouchersModel;
import mysql.vouchers.DAOVouchers;
import view.vouchers.VManagerView;

public class VManagerController extends VManagerView implements ActionListener,TableModelListener{

    private static VManagerController instance;
    private DAOVouchers dao;
    private IDataProvider data;
    private TablePager<VouchersModel> tp;
    
    public VManagerController()throws Exception{
        super();
        this.registerObjects();
        this.registerEvents();
    }
    
    public static VManagerController getInstance(){
        try {
            instance=new VManagerController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        this.jbtDownload.addActionListener(this);
        this.jbtSearch.addActionListener(this);
        this.jtList.getModel().addTableModelListener(this);
        this.jcb.addActionListener(this);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                VMainController.getInstance();
            }
        });
    }
    
    private void registerObjects(){
        this.dao=new DAOVouchers();
        this.dao.model(jtList);
        this.load("");
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(jbtDownload==e.getSource()){
            this.btnDownload();
        }else if(jbtSearch==e.getSource()){
            this.btnSearch();
        }
        this.tp.cbEvent(jcb);
    }
    
    @Override
    public void tableChanged(TableModelEvent e) {
        this.tp.updateButtonsPager();
    }
    
    private void btnDownload(){
        
    }
    
    private void btnSearch(){
        String search=jtfSearch.getText();
        this.load(search);
    }
    
    private void load(String search){
        this.data=createDataProvider(search);
        this.tp=new TablePager(jtList, data, new int[]{5,10,20,50,75,100}, 10);
        this.tp.createListRowsAllowed(jpPagination);
        this.jcb=tp.getCbRowAllowed();
        this.jcb.setSelectedItem(Integer.valueOf("10"));
        this.tp.updateButtonsPager();
    }
    
    private IDataProvider<VouchersModel> createDataProvider(String search){
        List<VouchersModel> list=dao.select(search);
        return new IDataProvider<VouchersModel>() {
            @Override
            public int getTotalRowCount() {
                return list.size();
            }

            @Override
            public List<VouchersModel> getRows(int startindex, int endindex) {
                return list.subList(startindex, endindex);
            }
        };
    }
}
