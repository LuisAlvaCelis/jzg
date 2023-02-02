package controller.fingering;

import addons.ExtraCode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Timer;
import model.ft.FTDetailPersonalModel;
import model.ft.FTPersonalModel;
import model.ft.FTTestModel;
import mysql.ft.DAODetailPersonalTest;
import mysql.ft.DAOPersonalTest;
import mysql.ft.DAOTest;
import view.fingering.FTTestView;

public class FTTestController extends FTTestView implements ActionListener{
    
    private static FTTestController instance;
    private FTPersonalModel model_p;
    private FTDetailPersonalModel model_dp;
    private FTTestModel model_t;
    private DAOTest dao_t;
    private DAODetailPersonalTest dao_dpt;
    private ArrayList<FTTestModel> tests;
    private Timer timer;
    private Date timeStart;
    private int countTest;
    private int currentTest;
    private int countMinutes;
    private int countSeconds;
    
    public FTTestController(FTPersonalModel model)throws Exception{
        super();
        this.registerEvents();
        this.registerObjects(model);
    }
    
    public static FTTestController getInstance(FTPersonalModel model){
        try {
            instance=new FTTestController(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    public void setModel(FTPersonalModel model){
        this.model_p=model;
    }
    
    private void registerEvents(){
        this.jbtCancel.addActionListener(this);
        this.jbtNext.addActionListener(this);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                FTLoginTestController.getIntance();
            }
        });
    }
    
    private void registerObjects(FTPersonalModel model){
        this.dao_t=new DAOTest();
        this.dao_dpt=new DAODetailPersonalTest();
        this.model_p=model;
        this.model_dp=new FTDetailPersonalModel();
        this.tests=dao_t.select();
        this.countTest=tests.size();
        this.currentTest=1;
        this.changeTest(currentTest);
        this.restart();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.countSeconds--;
        if(countSeconds==0){
            if(countMinutes==0 && countSeconds==0){
                this.timer.stop();
                this.btnNext();
            }
            countMinutes--;
            countSeconds=60;
        }
        ExtraCode.printTime(0, countMinutes, countSeconds,jlTime);
        if(jbtCancel==e.getSource()){
            this.btnCancel();
        }else if(jbtNext==e.getSource()){
            this.btnNext();
        }
    }
    
    private void btnCancel(){
        FTLoginTestController.getIntance();
        this.dispose();
        this.timer.stop();
    }
    
    private void btnNext(){
        if(currentTest==countTest){
            String preview=jtaPreview.getText();
            String details=jtaResult.getText();
            double percentage=ExtraCode.similarity(preview, details);
            this.model_dp=new FTDetailPersonalModel(0, model_p.getId(), tests.get(currentTest-1).getId(), timeStart, ExtraCode.getCurrentDate(), percentage);
            this.model_p.setTimeEnd(ExtraCode.getCurrentDate());
            this.dao_dpt.setModel(model_dp);
            if(dao_dpt.insert()){
                DAOPersonalTest aux=new DAOPersonalTest(model_p);
                if(aux.update()){
                    ExtraCode.sendMessageSuccessfully("Prueba finalizada");
                    this.timer.stop();
                    FTLoginTestController.getIntance();
                    this.dispose();
                }
            }
        }else if(currentTest<countTest){
            this.timer.stop();
            String preview=jtaPreview.getText();
            String details=jtaResult.getText();
            double percentage=ExtraCode.similarity(preview, details);
            this.model_dp=new FTDetailPersonalModel(0, model_p.getId(), model_t.getId(), timeStart, ExtraCode.getCurrentDate(), percentage);
            this.dao_dpt.setModel(model_dp);
            if(dao_dpt.insert()){
                ExtraCode.sendMessageSuccessfully("Prueba finalizada, pasará a la próxima prueba.");
                this.currentTest++;
                this.restart();
                this.changeTest(currentTest);
                this.jtaResult.setText(null);
                if(currentTest==countTest){
                    jbtNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_end_off.png")));
                    jbtNext.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_end_on.png")));
                    jbtNext.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fingering_test/btn_end_on.png")));
                }
            }
        }
    }
    
    private void changeTest(int test){
        if(test!=0){
            this.jlNameTest.setText(tests.get(test-1).getName());
            this.jtaPreview.setText(tests.get(test-1).getDetails());
            this.timeStart=ExtraCode.getCurrentDate();
        }else{
            ExtraCode.sendMessageError("Error: No hay pruebas disponibles.");
        }
    }
    
    private void restart(){
        this.model_t=tests.get(currentTest-1);
        this.countMinutes=model_t.getMinutes();
        this.countSeconds=model_t.getSeconds();
        this.timer=new Timer(1000,this);
        this.timer.start();
        ExtraCode.printTime(0, countMinutes, countSeconds,jlTime);
    }
}
