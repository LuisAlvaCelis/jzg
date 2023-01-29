package controller.fingering;

import addons.ExtraCode;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import mysql.ft.DAOPersonalTest;
import view.fingering.FTManagerPersonalView;

public class FTManagerPersonalController extends FTManagerPersonalView implements ActionListener{

    private static FTManagerPersonalController instance;
    private DAOPersonalTest dao;
    
    public FTManagerPersonalController()throws Exception{
        super();
        this.registerEvents();
        this.registerObjects();
    }
    
    public static FTManagerPersonalController getInstance(){
        try {
            instance=new FTManagerPersonalController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        this.jbtSearch.addActionListener(this);
        this.jtPersonal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                clickTable(e);
            }
        });
        
        this.jtfSearch.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    btnSearch();
                }
            }
        });
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                FTManagerController.getInstance();
            }
        });
    }
    
    private void registerObjects(){
        this.dao=new DAOPersonalTest();
        this.dao.writeTable(jtPersonal, null);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(jbtSearch==e.getSource()){
            this.btnSearch();
        }
    }
    
    private void btnSearch(){
        String search=jtfSearch.getText();
        if(!search.isEmpty()){
            this.dao.writeTable(jtPersonal, search);
        }
    }
    
    private void clickTable(MouseEvent e){
        int click=jtPersonal.rowAtPoint(e.getPoint());
        int id=Integer.parseInt(jtPersonal.getValueAt(click, 0).toString());
        int column=jtPersonal.getColumnModel().getColumnIndexAtX(e.getX());
        int row=e.getY()/jtPersonal.getRowHeight();
        int countrow=jtPersonal.getRowCount();
        int countcolumn=jtPersonal.getColumnCount();
        if(row<countrow && row>=0 && column<countcolumn && column>=0){
            Object value=jtPersonal.getValueAt(row, column);
            if(value instanceof JButton btn){
                btn.doClick();
                if(btn.getText().equalsIgnoreCase("Ver resultados")){
                    ExtraCode.sendMessageError("Próximamente...");
                }
            }
        }
    }
}
