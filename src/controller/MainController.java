package controller;

import addons.ExtraCode;
import controller.emails.EmailMainController;
import controller.fingering.FTMainController;
import controller.proposals.PMainController;
import controller.svc.SVCMainController;
import controller.vouchers.VMainController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ConnectionModel;
import view.MainView;

public class MainController extends MainView implements ActionListener{

    private static MainController instance;
    
    public MainController()throws Exception{
        super();
        this.registerEvents();
        this.registerObjects();
    }
    
    public static MainController getInstance(){
        try {
            instance=new MainController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        this.jbtEmails.addActionListener(this);
        this.jbtVerifyEmails.addActionListener(this);
        this.jbtFingeringTest.addActionListener(this);
        this.jbtProposal.addActionListener(this);
        this.jbtVouchers.addActionListener(this);
    }
    
    private void registerObjects(){
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(jbtEmails==e.getSource()){
            this.btnJoinEmails();
        }else if(jbtVerifyEmails==e.getSource()){
            this.btnVerifyEmails();
        }else if(jbtFingeringTest==e.getSource()){
            this.btnFingeringTest();
        }else if(jbtProposal==e.getSource()){
            this.btnProposal();
        }else if(jbtVouchers==e.getSource()){
            this.btnVouchers();
        }
    }
    
    private void btnVouchers(){
        ConnectionModel connection=new ConnectionModel();
        if(connection.isStatus()){
            VMainController.getInstance();
            this.dispose();
        }else{
            ExtraCode.sendMessageError("Error: Base de datos no establecida.");
        }
    }
    
    private void btnProposal(){
        ConnectionModel connection=new ConnectionModel();
        if(connection.isStatus()){
            PMainController.getInstance();
            this.dispose();
        }else{
            ExtraCode.sendMessageError("Error: Base de datos no establecida.");
        }
    }
    
    private void btnFingeringTest(){
        ConnectionModel connection=new ConnectionModel();
        if(connection.isStatus()){
            FTMainController.getInstance();
            this.dispose();
        }else{
            ExtraCode.sendMessageError("Error: Base de datos no establecida.");
        }
    }
    
    private void btnVerifyEmails(){
        ConnectionModel connection=new ConnectionModel();
        if(connection.isStatus()){
            SVCMainController.getInstance();
            this.dispose();
        }else{
            ExtraCode.sendMessageError("Error: Base de datos no establecida.");
        }
    }
    
    private void btnJoinEmails(){
        ConnectionModel connection=new ConnectionModel();
        if(connection.isStatus()){
            EmailMainController.getInstance();
            this.dispose();
        }else{
            ExtraCode.sendMessageError("Error: Base de datos no establecida.");
        }
    }
}
