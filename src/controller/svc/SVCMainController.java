package controller.svc;

import addons.ExtraCode;
import controller.MainController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFileChooser;
import view.svc.SVCMainView;

public class SVCMainController extends SVCMainView implements ActionListener{
    
    private static SVCMainController instance;
    private SMTP smtp;
    
    public SVCMainController()throws Exception{
        super();
        this.registerEvents();
        this.registerObjects();
    }
    
    public static SVCMainController getInstance(){
        try {
            instance=new SVCMainController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        this.jbtExamine1.addActionListener(this);
        this.jbtExamine2.addActionListener(this);
        this.jbtStart1.addActionListener(this);
        this.jbtStart2.addActionListener(this);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                MainController.getInstance();
            }
        });
    }
    
    private void registerObjects(){
        this.smtp=new SMTP();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(jbtExamine1==e.getSource()){
            this.btnExamine1();
        }else if(jbtExamine2==e.getSource()){
            this.btnExamine2();
        }else if(jbtStart1==e.getSource()){
            this.btnStart1();
        }else if(jbtStart2==e.getSource()){
            this.btnStart2();
        }
    }
    
    private void btnExamine1(){
        JFileChooser jfc = new JFileChooser();
        if (jfc.showDialog(this, "Seleccione archivo (.xlsx)") == JFileChooser.APPROVE_OPTION) {
            String path = jfc.getSelectedFile().getAbsolutePath();
            if (path.endsWith("xlsx")) {
                this.jtfPathFile1.setText(path);
            } else {
                ExtraCode.sendMessageError("Error: Archivo no admitido, vuelva a intentarlo.");
            }
        }
    }
    
    private void btnExamine2(){
        JFileChooser jfc = new JFileChooser();
        if (jfc.showDialog(this, "Seleccione archivo (.xlsx)") == JFileChooser.APPROVE_OPTION) {
            String path = jfc.getSelectedFile().getAbsolutePath();
            if (path.endsWith("xlsx")) {
                this.jtfPathFile2.setText(path);
            } else {
                ExtraCode.sendMessageError("Error: Archivo no admitido, vuelva a intentarlo.");
            }
        }
    }
    
    private void btnStart1(){
        String path=jtfPathFile1.getText();
        if(!path.isEmpty()){
            this.smtp.read(path, jlCurrent1,instance);
        }else{
            ExtraCode.sendMessageError("Error: No ha seleccionado el archivo con la data de correos.");
        }
    }
    
    private void btnStart2(){
        String path=jtfPathFile2.getText();
        if(!path.isEmpty()){
            this.smtp.validate(path, jlCurrent2, instance);
        }else{
            ExtraCode.sendMessageError("Error: No ha seleccionado el archivo con la data de correos.");
        }
    }
}
