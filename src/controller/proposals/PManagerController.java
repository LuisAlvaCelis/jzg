package controller.proposals;

import addons.ExtraCode;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import model.proposals.CustomerModel;
import mysql.proposals.DAOProposals;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import view.proposals.PManagerView;

public class PManagerController extends PManagerView implements ActionListener{

    private static PManagerController instance;
    private DAOProposals dao;
    private CustomerModel model;
    
    public PManagerController()throws Exception{
        super();
        this.registerEvents();
        this.registerObjects();
    }
    
    public static PManagerController getInstance(){
        try {
            instance=new PManagerController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
    
    private void registerEvents(){
        this.jbtDeleteAll.addActionListener(this);
        this.jbtExamine.addActionListener(this);
        this.jbtSearch.addActionListener(this);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                PMainController.getInstance();
            }
        });
    }
    
    private void registerObjects(){
        this.dao=new DAOProposals();
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(jbtDeleteAll==e.getSource()){
            this.btnDeleteAll();
        }else if(jbtExamine==e.getSource()){
            this.btnExamine();
        }else if(jbtSearch==e.getSource()){
            this.btnSearch();
        }
    }
    
    private void btnSearch(){
        String search=jtfSearch.getText();
        if(!search.isEmpty()){
            this.model=dao.select(search);
            if(model!=null){
                ExtraCode.writeConsole(jtaConsole, "Cliente: "+model.getName()+"\nCódigo Score: "+model.getCodeScore()+"\nCódigo Cliente/BT: "+model.getCodeBT()+"\nDNI: "+model.getDni()+"\nPorcentaje de descuento: "+ExtraCode.toPercentage(model.getPercentageDscto())+"\nCapital: "+model.getCapital()+"\nCampaña: "+model.getCampaign()+"\nAño de castigo: "+model.getYearCast()+"\nEmpresa: "+model.getEmp());
            }else{
                ExtraCode.sendMessageError("Error: Cliente no encontrado, vuelva a intentarlo.");
            }
        }else{
            ExtraCode.sendMessageError("Error: Datos a buscar no ingresado, vuelva a intentarlo.");
        }
    }
    
    private void btnExamine(){
        String date_start=ExtraCode.getCurrentDate("dd/MM/yyyy hh:mm:ss aa");
        JFileChooser jfc=new JFileChooser();
        if(jfc.showDialog(this, "Seleccione archivo (.xlsx)")==JFileChooser.APPROVE_OPTION){
            String path=jfc.getSelectedFile().getAbsolutePath();
            if(path.endsWith("xlsx")){
                this.jtfPathFile.setText(path);
                if(ExtraCode.sendMessageConfirm("Se empezará a subir la data a la base de datos, esto puede tardar unos minutos...\n¿Seguro que quiere continuar?")==0){
                    this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                    if(uploadData(path)){
                        this.repaint();
                        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                        String date_end=ExtraCode.getCurrentDate("dd/MM/yyyy hh:mm:ss aa");
                        ExtraCode.writeConsole(jtaConsole, "Data subida exitosamente.\nFecha de inicio: "+date_start+"\nFecha de fin: "+date_end);
                    }else{
                        ExtraCode.sendMessageError("Error: No se pudo subir complementamente la data.\nError inesperado.");
                    }
                }
            }
        }
    }
    
    private void btnDeleteAll(){
        int result=ExtraCode.sendMessageConfirm("¿Seguro que quiere eliminar toda la data de la base de datos?");
        if(result==0){
            boolean status=dao.delete("DELETE FROM customer_proposals");
            if(status==true){
                ExtraCode.sendMessageSuccessfully("Data eliminada con éxito.");
                ExtraCode.writeConsole(jtaConsole, "["+ExtraCode.getCurrentDate("dd/MM/yyyy hh:mm:ss aa")+"] Data eliminada con éxito.");
            }else{
                ExtraCode.sendMessageError("Error: No se pudo eliminar la data, consulte con el creado del programa.");
            }
        }
    }
    
    private boolean uploadData(String path){
        boolean status=false;
        try {
            String sql="INSERT INTO customer_proposals (code_score,code_bt,name,dni,percentage_dscto,campaign,capital,year_cast,emp) VALUES ";
            FileInputStream fis=new FileInputStream(path);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);
            int numRows=sheet.getLastRowNum();
            int numColumns=sheet.getRow(0).getPhysicalNumberOfCells();
            for (int i = 1; i <= numRows; i++) {
                Row row = sheet.getRow(i);
                CustomerModel cm=new CustomerModel();
                for(int j=0;j<numColumns;j++){
                    if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("CODIGO_SCORE")){
                        if(row.getCell(j)==null){
                            cm.setCodeScore(null);
                        }else{
                            cm.setCodeScore(ExtraCode.convertCellValueToString(row.getCell(j)));
                        }
                    }
                    if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("CODIGO_CLIENTE")){
                        if(row.getCell(j)==null){
                            cm.setCodeBT(null);
                        }else{
                            cm.setCodeBT(ExtraCode.convertCellValueToString(row.getCell(j)));
                        }
                    }
                    if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("CLIENTE")){
                        if(row.getCell(j)==null){
                            cm.setName(null);
                        }else{
                            cm.setName(ExtraCode.convertCellValueToString(row.getCell(j)));
                        }
                    }
                    if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("DNI")){
                        if(row.getCell(j)==null){
                            cm.setDni(null);
                        }else{
                            cm.setDni(ExtraCode.convertCellValueToString(row.getCell(j)));
                        }
                    }
                    if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("DSCTO")){
                        if(row.getCell(j)==null){
                            cm.setPercentageDscto(0);
                        }else{
                            cm.setPercentageDscto(row.getCell(j).getNumericCellValue());
                        }
                    }
                    if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("MONTO_CAMPAÑA")){
                        if(row.getCell(j)==null){
                            cm.setCampaign(0);
                        }else{
                            cm.setCampaign(row.getCell(j).getNumericCellValue());
                        }
                    }
                    if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("MONTO_CAPITAL")){
                        if(row.getCell(j)==null){
                            cm.setCapital(0);
                        }else{
                            cm.setCapital(row.getCell(j).getNumericCellValue());
                        }
                    }
                    if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("AÑO_CASTIGO")){
                        if(row.getCell(j)==null){
                            cm.setYearCast(0);
                        }else{
                            int year=(int)Math.round(row.getCell(j).getNumericCellValue());
                            cm.setYearCast(year);
                        }
                    }
                    if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("EMPRESA")){
                        if(row.getCell(j)==null){
                            cm.setEmp(null);
                        }else{
                            cm.setEmp(ExtraCode.convertCellValueToString(row.getCell(j)));
                        }
                    }
                }
                System.out.println("('"+cm.getCodeScore()+"','"+cm.getCodeBT()+"','"+cm.getName()+"','"+cm.getDni()+"',"+cm.getPercentageDscto()+","+cm.getCampaign()+","+cm.getCapital()+","+cm.getYearCast()+",'"+cm.getEmp()+"')");
                sql=sql+"('"+cm.getCodeScore()+"','"+cm.getCodeBT()+"','"+cm.getName()+"','"+cm.getDni()+"',"+cm.getPercentageDscto()+","+cm.getCampaign()+","+cm.getCapital()+","+cm.getYearCast()+",'"+cm.getEmp()+"'),";
            }
            sql=(String)sql.subSequence(0, sql.length()-1);
            if(dao.insert(sql)){
                status=true;
            }else{
                ExtraCode.sendMessageError("Error: No se pudo registrar la data, vuelva a intentarlo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return status;
    }
}
