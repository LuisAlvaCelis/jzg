package files;

import addons.ExtraCode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bukkit.configuration.file.YamlConfiguration;

public class FileClass {
    
    private static FileClass instance;
    private final File directory;
    private final File file;
    
    private final File directoryReport;
    private final File fileReport;
    private final YamlConfiguration config;
    
    public FileClass(){
        this.directory=new File("C:\\JZG");
        this.file=new File(directory,"config.yml");
        this.directoryReport=new File("C:\\JZG\\SECM - Reports");
        this.fileReport=new File(directoryReport,ExtraCode.getCurrentDate("MM-yyyy")+".xlsx");
        this.config=YamlConfiguration.loadConfiguration(file);
    }
    
    public static FileClass getInstance(){
        return instance=new FileClass();
    }
    
    public boolean createFile(){
        boolean status=false;
        try {
            if(!file.exists()){
                this.directory.mkdir();
                this.file.createNewFile();
                this.config.set("MySQL.ip", "");
                this.config.set("MySQL.port", "");
                this.config.set("MySQL.database", "");
                this.config.set("MySQL.username", "");
                this.config.set("MySQL.password", "");
                this.config.set("MySQL.status", false);
                this.config.save(file);
                status=true;
            }else{
                status=true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return status;
    }
    
    public boolean createReportFile(){
        boolean status=false;
        try {
            if(!fileReport.exists()){
                this.directoryReport.mkdir();
                this.fileReport.createNewFile();
                Workbook book=new XSSFWorkbook();
                Sheet sheet = book.createSheet(ExtraCode.getCurrentDate("MM-yyyy"));
                Row row=sheet.createRow(0);
                row.createCell(0).setCellValue("DATA NAME");
                row.createCell(1).setCellValue("DNI");
                row.createCell(2).setCellValue("CODE CUSTOMER");
                row.createCell(3).setCellValue("CUSTOMER");
                row.createCell(4).setCellValue("E-MAIL");
                row.createCell(5).setCellValue("DATE");
                FileOutputStream fos=new FileOutputStream(fileReport);
                book.write(fos);
                fos.close();
                status=true;
            }else{
                status=true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return status;
    }
    
    public YamlConfiguration getConfigFile(){
        return this.config;
    }
    
    public File getReportFile(){
        return this.fileReport;
    }
}
