package controller.fingering;

import addons.ExtraCode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import view.fingering.FTManagerLoginView;

public class FTManagerLoginController extends FTManagerLoginView implements ActionListener{
    
    private static FTManagerLoginController instance;
    
    public FTManagerLoginController()throws Exception{
        super();
        this.registerEvents();
        this.registerObjects();
    }
    
    public static FTManagerLoginController getInstance(){
        try {
            instance=new FTManagerLoginController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        this.jbtJoin.addActionListener(this);
        this.jbtShowPassword.addActionListener(this);
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
        if(jbtShowPassword==e.getSource()){
            this.btnShowPassword();
        }else if(jbtJoin==e.getSource()){
            this.btnJoin();
        }
    }
    
    private void btnJoin(){
        String username=jtfUsername.getText();
        String password=new String(jpfPassword.getPassword());
        if(!username.isEmpty()){
            if(!password.isEmpty()){
                if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("rrhh2023")){
                    FTManagerController.getInstance();
                    this.dispose();
                }else{
                    ExtraCode.sendMessageError("Error: Usuario o contraseña erroneos.");
                }
            }else{
                ExtraCode.sendMessageError("Error: Contraseña no ingresada.");
            }
        }else{
            ExtraCode.sendMessageError("Error: Usuario no ingresado.");
        }
    }
    
    private void btnShowPassword(){
        if(jbtShowPassword.isSelected()){
            this.jpfPassword.setEchoChar((char)0);
        }else{
            this.jpfPassword.setEchoChar('•');
        }
    }
}
