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
import model.ft.FTTestModel;
import mysql.ft.DAOTest;
import view.fingering.FTManagerTestView;

public class FTManagerTestController extends FTManagerTestView implements ActionListener{
    
    private static FTManagerTestController instance;
    private DAOTest dao;
    
    public FTManagerTestController()throws Exception{
        super();
        this.registerEvents();
        this.registerObjects();
    }
    
    public static FTManagerTestController getInstance(){
        try {
            instance=new FTManagerTestController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        this.jbtNew.addActionListener(this);
        this.jbtRegister.addActionListener(this);
        this.jbtSearch.addActionListener(this);
        this.jbtUpdate.addActionListener(this);
        
        this.jtfSearchTest.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    btnSearch();
                }
            }
        });
        
        this.jtTests.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                clickTable(e);
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
        this.dao=new DAOTest();
        this.dao.writeTable(jtTests,null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(jbtNew==e.getSource()){
            this.btnNew();
        }else if(jbtRegister==e.getSource()){
            this.btnRegister();
        }else if(jbtSearch==e.getSource()){
            this.btnSearch();
        }else if(jbtUpdate==e.getSource()){
            this.btnUpdate();
        }
    }
    
    private void clickTable(MouseEvent e){
        int click=jtTests.rowAtPoint(e.getPoint());
        int id=Integer.parseInt(jtTests.getValueAt(click, 0).toString());
        int column=jtTests.getColumnModel().getColumnIndexAtX(e.getX());
        int row=e.getY()/jtTests.getRowHeight();
        int countrow=jtTests.getRowCount();
        int countcolumn=jtTests.getColumnCount();
        if(row<countrow && row>=0 && column<countcolumn && column>=0){
            Object value=jtTests.getValueAt(row, column);
            if(value instanceof JButton btn){
                btn.doClick();
                if(btn.getText().equalsIgnoreCase("Eliminar")){
                    if(ExtraCode.sendMessageConfirm("¿Seguro que quiere eliminar esta prueba?")==0){
                        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                        this.dao.setModel(dao.selectSpecificID(id));
                        if(dao.delete()){
                            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                            ExtraCode.sendMessageSuccessful("Prueba eliminada con éxito.");
                            this.dao.writeTable(jtTests, null);
                        }
                    }
                }else if(btn.getText().equalsIgnoreCase("Modificar")){
                    FTTestModel aux=dao.selectSpecificID(id);
                    this.jtfNameTest.setText(aux.getName());
                    this.jtfNameTest.setName(String.valueOf(id));
                    this.jtaDetailTest.setText(aux.getDetails());
                    this.statusButtons(false, true);
                }
            }
        }
    }
    
    private void btnSearch(){
        String search=jtfSearchTest.getText();
        if(!search.isEmpty()){
            this.dao.writeTable(jtTests, search);
        }
    }
    
    private void btnUpdate(){
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        int id=(jtfNameTest.getName()==null)? 0:Integer.parseInt(jtfNameTest.getName());
        String name=jtfNameTest.getText();
        String details=jtaDetailTest.getText();
        if(id!=0){
            if(!name.isEmpty()){
                if(!details.isEmpty()){
                    FTTestModel ftmodel=new FTTestModel(id, name, details, null,ExtraCode.getCurrentDate());
                    this.dao.setModel(ftmodel);
                    if(dao.update()){
                        ExtraCode.sendMessageSuccessful("Prueba actualizada con éxito.");
                        this.btnNew();
                        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    }else{
                        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                        ExtraCode.sendMessageError("Error: No se pudo registrar la prueba, vuelva a intentarlo.");
                    }
                }else{
                    this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                    ExtraCode.sendMessageError("Error: Detalle de la prueba no ingresado, vuelva a intentarlo.");
                }
            }else{
                this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                ExtraCode.sendMessageError("Error: Nombre de prueba no ingresado, vuelva a intentarlo.");
            }
        }else{
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            ExtraCode.sendMessageError("Error: ID no indentificada, vuelva a intentarlo.");
        }
    }
    
    private void btnRegister(){
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        String name=jtfNameTest.getText();
        String details=jtaDetailTest.getText();
        if(!name.isEmpty()){
            if(!details.isEmpty()){
                FTTestModel ftmodel=new FTTestModel(0, name, details, ExtraCode.getCurrentDate(),null);
                this.dao.setModel(ftmodel);
                if(dao.insert()){
                    ExtraCode.sendMessageSuccessful("Prueba registrada con éxito.");
                    this.btnNew();
                    this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }else{
                    this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                    ExtraCode.sendMessageError("Error: No se pudo registrar la prueba, vuelva a intentarlo.");
                }
            }else{
                this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                ExtraCode.sendMessageError("Error: Detalle de la prueba no ingresado, vuelva a intentarlo.");
            }
        }else{
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            ExtraCode.sendMessageError("Error: Nombre de prueba no ingresado, vuelva a intentarlo.");
        }
    }
    
    private void btnNew(){
        this.jtfNameTest.setText(null);
        this.jtfNameTest.setName(null);
        this.jtfSearchTest.setText(null);
        this.jtaDetailTest.setText(null);
        this.statusButtons(true, false);
        this.dao.writeTable(jtTests,null);
    }
    
    private void statusButtons(boolean register,boolean update){
        this.jbtRegister.setEnabled(register);
        this.jbtUpdate.setEnabled(update);
    }
}
