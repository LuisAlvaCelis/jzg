package addons;

import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;

public class ExtraCode {
    
    public static boolean deleteFile(String path){
        File file=new File(path);
        return file.delete();
    }
    
    public static String convertCellValueToString(Cell cell){
        String value=null;
        switch(cell.getCellTypeEnum()){
            case STRING -> value=cell.getStringCellValue();
            case NUMERIC -> value=String.valueOf(cell.getNumericCellValue());
            default -> {
            }
        }
        return value;
    }
    
    public static String isAllFilesPDF(String path){
        String fileProblem=null;
        File folder=new File(path);
        for (File file : folder.listFiles()) {
            if(!file.getName().endsWith(".pdf")){
                fileProblem=file.getName();
                break;
            }
        }
        return fileProblem;
    }
    
    public static void writeConsole(JTextArea jta,String msg){
        if(jta.getText().isEmpty()){
            jta.append(msg);
        }else{
            jta.append("\n"+msg);
        }
        jta.repaint();
    }
    
    public static DefaultTableModel getDefaultTableModel(JTable jtable){
        jtable.setDefaultRenderer(Object.class, new RendererTable());
        String[] columns=new String[jtable.getModel().getColumnCount()]; 
        for(int i=0;i<columns.length;i++){
            columns[i]=jtable.getModel().getColumnName(i);
        }
        DefaultTableModel dtm=new DefaultTableModel(null,columns){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        return dtm;
    }
    
    public static String convertDateFormat(Date date,String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        return sdf.format(date);
    }
    
    public static String getCurrentDate(String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        return sdf.format(Calendar.getInstance().getTime());
    }
    
    public static Date getCurrentDate(){
        return Calendar.getInstance().getTime();
    }
    
    public static void consumeLetter(KeyEvent e){
        if(Character.isLetter(e.getKeyChar())){
            e.consume();
            sendMessageError("Error: Debe colocar solo números, no letras.");
        }
    }
    
    public static void loadDataComboBox(JComboBox jcb,ArrayList data){
        jcb.removeAllItems();
        jcb.addItem("---- Seleccione ----");
        ArrayList<String> list=data;
        for(int i=0;i<list.size();i++){
            jcb.addItem(list.get(i));
        }
    }
    
    public static void sendMessageError(String msg){
        JOptionPane.showMessageDialog(null, msg, "Error", 0, new ImageIcon(new ExtraCode().getClass().getResource("/images/error32x32.png")));
    }
    
    public static void sendMessageSuccessful(String msg){
        JOptionPane.showMessageDialog(null, msg, "Éxito", 0, new ImageIcon(new ExtraCode().getClass().getResource("/images/exito32x32.png")));
    }
    
    public static int sendMessageConfirm(String msg){
        return JOptionPane.showConfirmDialog(null, msg, "Confirmar", 0, 0, new ImageIcon(new ExtraCode().getClass().getResource("/images/archivos32x32.png")));
    }
}
