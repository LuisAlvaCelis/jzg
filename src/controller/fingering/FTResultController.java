package controller.fingering;

import addons.ExtraCode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.ft.FTDetailPersonalModel;
import model.ft.FTPersonalModel;
import model.ft.FTTestModel;
import mysql.ft.DAODetailPersonalTest;
import mysql.ft.DAOPersonalTest;
import mysql.ft.DAOTest;
import view.fingering.FTResultView;

public class FTResultController extends FTResultView implements ActionListener{

    private static FTResultController instance;
    private FTPersonalModel model;
    private DAOTest dao_t;
    private DAOPersonalTest dao_p;
    private DAODetailPersonalTest dao_dp;
    
    public FTResultController(FTPersonalModel model)throws Exception{
        super();
        this.registerEvents();
        this.registerObjects(model);
    }
    
    public static FTResultController getInstance(FTPersonalModel model){
        try {
            instance=new FTResultController(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        this.jbtDeleteTest.addActionListener(this);
        this.jlTests.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                    JList list=(JList)e.getSource();
                    String test=list.getSelectedValue().toString();
                    clickList(test);
                }
            }
        });
    }
    
    private void registerObjects(FTPersonalModel model){
        this.model=model;
        this.dao_t=new DAOTest();
        this.dao_p=new DAOPersonalTest();
        this.dao_p.setModel(model);
        this.dao_dp=new DAODetailPersonalTest();
        this.loadInt();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(jbtDeleteTest==e.getSource()){
            this.btnDeleteTest();
        }
    }
    
    private void btnDeleteTest(){
        if(ExtraCode.sendMessageConfirm("¿Segur@ que quiere eliminar los resultados?")==0){
            if(dao_dp.deleteSpecificIDPersonal(model.getId())){
                ExtraCode.sendMessageSuccessful("Resultados eliminados");
                if(dao_p.delete()){
                    ExtraCode.sendMessageSuccessful("Personal eliminado.");
                    this.dispose();
                }else{
                    ExtraCode.sendMessageError("Error: No se pudo eliminar al personal.");
                }
            }else{
                ExtraCode.sendMessageError("Error: No se pudo eliminar los resultados o no existen resultados.\nEliminado personal...");
                if(dao_p.delete()){
                    ExtraCode.sendMessageSuccessful("Personal eliminado.");
                    this.dispose();
                }else{
                    ExtraCode.sendMessageError("Error: No se pudo eliminar al personal.");
                }
            }
        }
    }
    
    private void loadInt(){
        String start=ExtraCode.convertDateFormat(model.getTimeStart(), "hh:mm:ss");
        String end=(model.getTimeEnd()!=null) ? ExtraCode.convertDateFormat(model.getTimeEnd(), "hh:mm:ss") : "0";
        ArrayList<FTDetailPersonalModel> list=dao_dp.selectSpecificIDPersonal(model.getId());
        DefaultListModel dlm=new DefaultListModel();
        double sum_percentage=0;
        for(int i=0;i<list.size();i++){
            FTDetailPersonalModel aux=list.get(i);
            for(FTTestModel tm:dao_t.select()){
                if(tm.getId()==aux.getIdTest()){
                    dlm.addElement(tm.getName());
                }
            }
            sum_percentage=sum_percentage+aux.getPercentageObtained();
        }
        this.jlTests.setModel(dlm);
        sum_percentage=sum_percentage/list.size();
        
        this.jlName.setText(model.getName().toUpperCase());
        this.jlStartTime.setText(ExtraCode.convertDateFormat(model.getTimeStart(), "dd/MM/yyyy hh:mm:ss aa"));
        this.jlEndTime.setText((model.getTimeEnd()!=null) ? ExtraCode.convertDateFormat(model.getTimeEnd(), "dd/MM/yyyy hh:mm:ss aa") : "No determinado.");
        this.jlDuration.setText((end.equalsIgnoreCase("0")) ? "Prueba no terminada." : ExtraCode.timeDuration(start, end));
        this.jlTestAverage.setText(ExtraCode.toPercentage(sum_percentage));
    }
    
    private void clickList(String nameTest){
        for(FTTestModel tm:dao_t.select()){
            if(tm.getName().equalsIgnoreCase(nameTest)){
                ArrayList<FTDetailPersonalModel> list=dao_dp.selectSpecificIDPersonal(model.getId());
                for(int i=0;i<list.size();i++){
                    FTDetailPersonalModel aux=list.get(i);
                    if(aux.getIdTest()==tm.getId()){
                        String start=ExtraCode.convertDateFormat(aux.getTimeStart(), "hh:mm:ss");
                        String end=(model.getTimeEnd()!=null) ? ExtraCode.convertDateFormat(aux.getTimeEnd(), "hh:mm:ss") : "No determinado";
                        this.jlStartTest.setText("Inicio: "+ExtraCode.convertDateFormat(aux.getTimeStart(), "dd/MM/yyyy hh:mm:ss aa"));
                        this.jlEndTest.setText((model.getTimeEnd()!=null) ? "Fin: "+ExtraCode.convertDateFormat(aux.getTimeEnd(), "dd/MM/yyyy hh:mm:ss aa") : "No determinado.");
                        this.jlDurationTest.setText((end.equalsIgnoreCase("No determinado")) ? "Duración no terminada": "Duración: "+ExtraCode.timeDuration(start, end));
                        this.jlSimilarityPercentage.setText("Porcentaje de similitud: "+ExtraCode.toPercentage(aux.getPercentageObtained()));
                    }
                }
                break;
            }
        }
    }
}
