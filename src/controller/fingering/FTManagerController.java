package controller.fingering;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import view.fingering.FTManagerView;

public class FTManagerController extends FTManagerView implements ActionListener{
    
    private static FTManagerController instance;
    
    public FTManagerController()throws Exception{
        super();
        this.registerEvents();
        this.registerObjects();
    }
    
    public static FTManagerController getInstance(){
        try {
            instance=new FTManagerController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        this.jbtRegisterPersonal.addActionListener(this);
        this.jbtTests.addActionListener(this);
                
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                FTMainController.getInstance();
            }
        });
    }
    
    private void registerObjects(){
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(jbtRegisterPersonal==e.getSource()){
            this.btnRegisterPersonal();
        }else if(jbtTests==e.getSource()){
            this.btnTests();
        }
    }
    
    private void btnRegisterPersonal(){
        
    }
    
    private void btnTests(){
        
    }
}
