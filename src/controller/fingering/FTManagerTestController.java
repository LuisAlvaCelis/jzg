package controller.fingering;

import addons.ExtraCode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import model.ft.FTTestModel;
import view.fingering.FTManagerTestView;

public class FTManagerTestController extends FTManagerTestView implements ActionListener{
    
    private static FTManagerTestController instance;
    
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
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                FTManagerController.getInstance();
            }
        });
    }
    
    private void registerObjects(){
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
    
    private void btnSearch(){
        
    }
    
    private void btnUpdate(){
        
    }
    
    private void btnRegister(){
        String name=jtfNameTest.getText();
        String details=jtaDetailTest.getText();
        if(!name.isEmpty()){
            if(!details.isEmpty()){
                FTTestModel ftmodel=new FTTestModel(0, name, details, ExtraCode.getCurrentDate());
                
            }else{
                ExtraCode.sendMessageError("Error: Detalle de la prueba no ingresado, vuelva a intentarlo.");
            }
        }else{
            ExtraCode.sendMessageError("Error: Nombre de prueba no ingresado, vuelva a intentarlo.");
        }
    }
    
    private void btnNew(){
        this.jtfNameTest.setText(null);
        this.jtfSearchTest.setText(null);
        this.jtaDetailTest.setText(null);
        this.statusButtons(true, false);
    }
    
    private void statusButtons(boolean register,boolean update){
        this.jbtRegister.setEnabled(register);
        this.jbtUpdate.setEnabled(update);
    }
}
