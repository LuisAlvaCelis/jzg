package controller.fingering;

import addons.ExtraCode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import model.ft.FTPersonalModel;
import mysql.ft.DAOPersonalTest;
import mysql.ft.DAOTest;
import view.fingering.FTLoginTestView;

public class FTLoginTestController extends FTLoginTestView implements ActionListener{
    
    private static FTLoginTestController instance;
    private DAOPersonalTest dao;
    
    public FTLoginTestController()throws Exception{
        super();
        this.registerEvents();
        this.registerObjects();
    }
    
    public static FTLoginTestController getIntance(){
        try {
            instance=new FTLoginTestController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        this.jbtStart.addActionListener(this);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                FTMainController.getInstance();
            }
        });
    }
    
    private void registerObjects(){
        this.dao=new DAOPersonalTest();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(jbtStart==e.getSource()){
            this.btnStart();
        }
    }
    
    private void btnStart(){
        String dni=jtfDni.getText();
        String name=jtfName.getText();
        if(!dni.isEmpty()){
            if(!name.isEmpty()){
                ArrayList<FTPersonalModel> aux=dao.select();
                if(aux.isEmpty()){
                    FTPersonalModel model=new FTPersonalModel(1, dni, name, ExtraCode.getCurrentDate(), null);
                    this.dao.setModel(model);
                    if(dao.insert()){
                        FTStartTimeController.getInstance().start(3, model);
                        this.dispose();
                    }else{
                        ExtraCode.sendMessageError("Error: No se pudo iniciar la prueba, vuelva a intentarlo.\n o comuníquese con el desarrollador del programa.");
                    }
                }else{
                    int current=aux.get(aux.size()-1).getId();
                    FTPersonalModel model=new FTPersonalModel(current+1, dni, name, ExtraCode.getCurrentDate(), null);
                    this.dao.setModel(model);
                    if(dao.insert()){
                        FTStartTimeController.getInstance().start(3, model);
                        this.dispose();
                    }else{
                        ExtraCode.sendMessageError("Error: No se pudo iniciar la prueba, vuelva a intentarlo.\n o comuníquese con el desarrollador del programa.");
                    }
                }
            }else{
                ExtraCode.sendMessageError("Error: Nombre no ingresado, vuelva a intentarlo.");
            }
        }else{
            ExtraCode.sendMessageError("Error: DNI no ingresado, vuelva a intentarlo.");
        }
    }
}
