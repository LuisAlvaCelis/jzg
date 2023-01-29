package controller.fingering;

import addons.ExtraCode;
import controller.MainController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import mysql.ft.DAOTest;
import view.fingering.FTMainView;

public class FTMainController extends FTMainView implements ActionListener{
    
    private static FTMainController instance;
    
    public FTMainController()throws Exception{
        super();
        this.registerEvents();
        this.registerObjects();
    }
    
    public static FTMainController getInstance(){
        try {
            instance=new FTMainController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        this.jbtManager.addActionListener(this);
        this.jbtStartTest.addActionListener(this);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                MainController.getInstance();
            }
        });
    }
    
    private void registerObjects(){
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(jbtManager==e.getSource()){
            this.btnManager();
        }else if(jbtStartTest==e.getSource()){
            this.btnStartTest();
        }
    }
    
    private void btnManager(){
        FTManagerLoginController.getInstance();
        this.dispose();
    }
    
    private void btnStartTest(){
        DAOTest dao=new DAOTest();
        if(!dao.select().isEmpty()){
            FTLoginTestController.getIntance();
            this.dispose();
        }else{
            ExtraCode.sendMessageError("Error: No hay pruebas disponibles.");
        }
    }
}
