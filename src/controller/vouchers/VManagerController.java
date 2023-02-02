package controller.vouchers;

import addons.ExtraCode;
import addons.IDataProvider;
import addons.TablePager;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFileChooser;
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
        
        this.jtfSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    btnSearch();
                }
            }
        });
        this.jtList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                clickTable(e);
            }
        });
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
    }
    
    @Override
    public void tableChanged(TableModelEvent e) {
        this.tp.updateButtonsPager();
    }
    
    private void btnDownload(){
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.setCurrentDirectory(new File("."));
            jfc.setDialogTitle("Seleccione la carpeta para guardar los archivos excel");
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            jfc.setAcceptAllFileFilterUsed(false);

            if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File directory = jfc.getSelectedFile();
                File file=new File(directory,"vauchers.xlsx");
                if(!file.exists()){
                    file.createNewFile();
                    this.dao.export(file);
                }
            }
        } catch (HeadlessException | IOException e) {
            e.printStackTrace();
        }
    }
    
    private void btnSearch(){
        String search=jtfSearch.getText();
        this.jpPagination.removeAll();
        this.jpPagination.validate();
        this.jpPagination.repaint();
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
        List<VouchersModel> list=dao.selectWithoutImage(search);
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
    
    private void clickTable(MouseEvent e){
        int click=jtList.rowAtPoint(e.getPoint());
        int id=Integer.parseInt(jtList.getValueAt(click, 0).toString());
        int column=jtList.getColumnModel().getColumnIndexAtX(e.getX());
        int row=e.getY()/jtList.getRowHeight();
        int countrow=jtList.getRowCount();
        int countcolumn=jtList.getColumnCount();
        if(row<countrow && row>=0 && column<countcolumn && column>=0){
            Object value=jtList.getValueAt(row, column);
            if(value instanceof JButton btn){
                btn.doClick();
                if(btn.getText().equalsIgnoreCase("Eliminar")){
                    VouchersModel aux=new VouchersModel();
                    aux.setId(id);
                    this.dao.setModel(aux);
                    if(ExtraCode.sendMessageConfirm("¿Seguro que quieres eliminar este váucher?")==0){
                        if(dao.delete()){
                            this.jpPagination.removeAll();
                            this.jpPagination.validate();
                            this.jpPagination.repaint();
                            this.load("");
                            ExtraCode.sendMessageSuccessfully("Vaucher eliminado con éxito.");
                        }else{
                            ExtraCode.sendMessageError("Error: No se pudo eliminar el váucher, vuelva a intentarlo.");
                        }
                    }
                }else if(btn.getText().equalsIgnoreCase("Mostrar imagen")){
                    VouchersController.getInstance(id);
                }
            }
        }
    }
}
