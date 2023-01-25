package controller.emails;

public class EmailExecuteAutomaticController extends Thread{
    
    private final Object monitor=new Object();
    private boolean status=false;
    private final EmailMainController emc;
    
    public EmailExecuteAutomaticController(EmailMainController emc){
        super();
        this.emc=emc;
    }
    
    @Override
    @SuppressWarnings("deprecation")
    public void run(){
        for(int i=0;;i++){
            this.checkForPaused();
            this.emc.sendMailAutomatic();
        }
    }
    
    private void checkForPaused(){
        synchronized(monitor){
            while(status==true){
                try {
                    this.monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void pauseThread(){
        this.status=true;
    }
    
    public void resumeThread() {
        synchronized(monitor) {
            status = false;
            this.monitor.notify();
        }
    }
}
