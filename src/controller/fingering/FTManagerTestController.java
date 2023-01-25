package controller.fingering;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
    }
    
    private void registerObjects(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
