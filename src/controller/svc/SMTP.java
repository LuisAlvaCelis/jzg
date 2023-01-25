package controller.svc;

import addons.ExtraCode;
import java.awt.Cursor;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.naming.*;
import javax.naming.directory.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.svc.SVCModel;
import mysql.svc.DAOValidatedEmails;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SMTP {
    
    private final DAOValidatedEmails dao;
    
    public SMTP(){
        this.dao=new DAOValidatedEmails();
    }
    
    public void validate(String path,JLabel console,JFrame instance){
        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);
            int numRows = sheet.getLastRowNum();
            int numColumns = sheet.getRow(0).getPhysicalNumberOfCells();
            Thread thread = null;
            thread = new Thread(() -> {
                for (int i = 1; i <= numRows; i++) {
                    instance.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                    instance.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                    Row row = sheet.getRow(i);
                    SVCModel svc=new SVCModel();
                    for (int j = 0; j < numColumns; j++) {
                        if (sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("CORREO")) {
                            svc.setEmail(ExtraCode.convertCellValueToString(row.getCell(j)));
                            SVCModel aux=dao.selectSpecificEmail(svc.getEmail());
                            if(aux==null){
                                row.createCell(2).setCellValue("No se encuentra registro");
                            }else{
                                row.createCell(2).setCellValue(aux.isValidationStatus());
                            }
                        }
                    }
                    instance.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    console.setText("Fila actual: "+i);
                    if(i==numRows){
                        console.setText("Proceso finalizado");
                        try (FileOutputStream fos = new FileOutputStream(path)) {
                            wb.write(fos);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            });
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void read(String path,JLabel console,JFrame instance) {
        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);
            int numRows = sheet.getLastRowNum();
            int numColumns = sheet.getRow(0).getPhysicalNumberOfCells();
            Thread thread = null;
            thread = new Thread(() -> {
                for (int i = 1; i <= numRows; i++) {
                    instance.setCursor(new Cursor(Cursor.WAIT_CURSOR));
                    Row row = sheet.getRow(i);
                    SVCModel svc=new SVCModel();
                    for (int j = 0; j < numColumns; j++) {
                        if (sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("DNI")) {
                            svc.setDni(ExtraCode.convertCellValueToString(row.getCell(j)));
                        }
                        if (sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase("CORREO")) {
                            svc.setEmail(ExtraCode.convertCellValueToString(row.getCell(j)));
                        }
                        svc.setRegisterDate(ExtraCode.getCurrentDate());
                    }
                    String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
                    Pattern pat = Pattern.compile(regex);
                    Matcher matcher=pat.matcher(svc.getEmail());
                    if(matcher.find() && (!svc.getEmail().contains(" ") && !svc.getEmail().contains(" "))){
                        SVCModel aux=dao.selectSpecificEmail(svc.getEmail());
                        if(aux==null){
                            boolean status=isAddressValid(svc.getEmail());
                            if(status==true){
                                svc.setValidationStatus(status);
                                this.dao.setModel(svc);
                                if(dao.insert()){
                                    instance.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                                    console.setText("Fila actual: "+i);
                                    if(i==numRows){
                                        console.setText("Proceso finalizado");
                                    }
                                    try {
                                        Thread.sleep(600);
                                    } catch (InterruptedException ex) {
                                        ex.printStackTrace();
                                    }
                                }
                            }else{
                                svc.setValidationStatus(status);
                                this.dao.setModel(svc);
                                if(dao.insert()){
                                    instance.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                                    console.setText("Fila actual: "+i);
                                    if(i==numRows){
                                        console.setText("Proceso finalizado");
                                    }
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException ex) {
                                        ex.printStackTrace();
                                    }
                                }
                            }
                        }
                    }else{
                        instance.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                        console.setText("Fila actual: "+i);
                        if(i==numRows){
                            console.setText("Proceso finalizado");
                        }
                    }
                }
            });
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int hear(BufferedReader in) throws IOException {
        String line = null;
        int res = 0;

        while ((line = in.readLine()) != null) {
            String pfx = line.substring(0, 3);
            try {
                res = Integer.parseInt(pfx);
            } catch (NumberFormatException ex) {
                res = -1;
            }
            if (line.charAt(3) != '-') {
                break;
            }
        }

        return res;
    }

    private static void say(BufferedWriter wr, String text) throws IOException {
        wr.write(text + "\r\n");
        wr.flush();
    }

    private ArrayList getMX(String hostName) throws NamingException {
        Hashtable env = new Hashtable();
        env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
        DirContext ictx = new InitialDirContext(env);
        Attributes attrs = ictx.getAttributes(hostName, new String[]{"MX"});
        Attribute attr = attrs.get("MX");

        if ((attr == null) || (attr.size() == 0)) {
            attrs = ictx.getAttributes(hostName, new String[]{"A"});
            attr = attrs.get("A");
            if (attr == null) {
                throw new NamingException("No match for name '" + hostName + "'");
            }
        }

        ArrayList res = new ArrayList();
        NamingEnumeration en = attr.getAll();

        while (en.hasMore()) {
            String x = (String) en.next();
            String f[] = x.split(" ");
            if(f.length>1){
                if (f[1].endsWith(".")) {
                    f[1] = f[1].substring(0, (f[1].length() - 1));
                }
                res.add(f[1]);
            }
        }
        return res;
    }

    private boolean isAddressValid(String address) {
        int pos = address.indexOf('@');

        if (pos == -1) {
            return false;
        }
        String domain = address.substring(++pos);
        try {
            ArrayList mxList = getMX(domain);
            if (mxList.isEmpty()) {
                return false;
            }
            for (int mx = 0; mx < mxList.size(); mx++) {
                boolean valid = false;
                try {
                    Socket skt = new Socket((String) mxList.get(mx), 25);
                    BufferedReader rdr = new BufferedReader(new InputStreamReader(skt.getInputStream()));
                    BufferedWriter wtr = new BufferedWriter(new OutputStreamWriter(skt.getOutputStream()));

                    int res = hear(rdr);
                    if (res != 220) {
                        throw new Exception("Invalid header");
                    }
                    say(wtr, "EHLO orbaker.com");

                    res = hear(rdr);
                    if (res != 250) {
                        throw new Exception("Not ESMTP");
                    }

                    // validate the sender address  
                    say(wtr, "MAIL FROM: <tim@orbaker.com>");
                    res = hear(rdr);
                    if (res != 250) {
                        throw new Exception("Sender rejected");
                    }
                    say(wtr, "RCPT TO: <" + address + ">");
                    res = hear(rdr);

                    // be polite
                    say(wtr, "RSET");
                    hear(rdr);
                    say(wtr, "QUIT");
                    hear(rdr);
                    if (res != 250) {
                        throw new Exception("Address is not valid!");
                    }

                    valid = true;
                    rdr.close();
                    wtr.close();
                    skt.close();
                } catch (Exception ex) {
                    return false;
                } finally {
                    if (valid) {
                        return true;
                    }
                }
            }
        } catch (NamingException ex) {
            return false;
        }
        return false;
    }
}
