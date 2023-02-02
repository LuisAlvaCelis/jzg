package addons;

import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;

public class ExtraCode {
    
    public static String sendInputPassword(String msg){
        return (String)JOptionPane.showInputDialog(null, msg, "Contraseña", 0, new ImageIcon(new ExtraCode().getClass().getResource("/images/archivos32x32.png")), null, null);
    }
    
    public static String convertTextFormat(double data){
        DecimalFormat df=new DecimalFormat("#,###.00");
        return df.format(data);
    }
    
    public static String toPercentage(double n){
        DecimalFormat df=new DecimalFormat("#.##");
        return df.format(n*100)+"%";
    }
    
    public static String timeDuration(String start,String end){
        String duration=null;
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        try {
            long resultat = (sdf.parse(start)).getTime()-(sdf.parse(end)).getTime();
            long hour=(resultat%86400000)/3600000;
            long minute=(((resultat%86400000)%3600000)/60000)*-1;
            long second=((((resultat%86400000)%3600000)%60000)/1000)*-1;
            duration=((hour<=9)?"0":"")+hour+":"+((minute<=9)?"0":"")+minute+":"+((second<=9)?"0":"")+second;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return duration;
    }
    
    public static void printTime(int count_hours,int count_minutes,int count_seconds,JLabel label){
        label.setText("Tiempo restante: "+(count_hours>9?count_hours:"0"+count_hours)+":"+(count_minutes>9?count_minutes:"0"+count_minutes)+":"+(count_seconds>9?count_seconds:"0"+count_seconds));
    }
    
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
    
    public static void sendTest(String msg,ImageIcon icon){
        JOptionPane.showMessageDialog(null, msg, "Error", 0, icon);
    }
    
    public static void sendMessageError(String msg){
        JOptionPane.showMessageDialog(null, msg, "Error", 0, new ImageIcon(new ExtraCode().getClass().getResource("/images/error32x32.png")));
    }
    
    public static void sendMessageSuccessfully(String msg){
        JOptionPane.showMessageDialog(null, msg, "Éxito", 0, new ImageIcon(new ExtraCode().getClass().getResource("/images/exito32x32.png")));
    }
    
    public static int sendMessageConfirm(String msg){
        return JOptionPane.showConfirmDialog(null, msg, "Confirmar", 0, 0, new ImageIcon(new ExtraCode().getClass().getResource("/images/archivos32x32.png")));
    }
    
    public static double similarity(String s1, String s2) {
        String longer = s1, shorter = s2;
        if (s1.length() < s2.length()) {
            longer = s2;
            shorter = s1;
        }
        int longerLength = longer.length();
        if (longerLength == 0) {
            return 1.0;
        }
        return (longerLength - editDistance(longer, shorter)) / (double) longerLength;
    }

    public static int editDistance(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[] costs = new int[s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            int lastValue = i;
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    costs[j] = j;
                } else {
                    if (j > 0) {
                        int newValue = costs[j - 1];
                        if (s1.charAt(i - 1) != s2.charAt(j - 1)) {
                            newValue = Math.min(Math.min(newValue, lastValue), costs[j]) + 1;
                        }
                        costs[j - 1] = lastValue;
                        lastValue = newValue;
                    }
                }
            }
            if (i > 0) {
                costs[s2.length()] = lastValue;
            }
        }
        return costs[s2.length()];
    }
}
