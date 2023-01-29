package controller.fingering;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import model.ft.FTPersonalModel;
import view.fingering.FTStartTimeView;

public class FTStartTimeController extends FTStartTimeView implements ActionListener{
    
    private static FTStartTimeController instance;
    private Timer timer;
    private FTPersonalModel model;
    private int seconds;
    
    public FTStartTimeController()throws Exception{
        super();
        this.registerEvents();
        this.registerObjects();
    }
    
    public static FTStartTimeController getInstance(){
        try {
            instance=new FTStartTimeController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        
    }
    
    private void registerObjects(){
        this.setVisible(true);
    }
    
    public void start(int seconds,FTPersonalModel model){
        this.seconds=seconds;
        this.jlSeconds.setText(String.valueOf(seconds));
        this.model=model;
        this.timer=new Timer(1000, this);
        this.timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.seconds--;
        this.jlSeconds.setText(String.valueOf(seconds));
        if(seconds==0){
            FTTestController.getInstance(model);
            this.timer.stop();
            this.dispose();
        }
    }
}
