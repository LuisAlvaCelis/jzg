package main;

import controller.MainController;
import files.FileClass;

public class MainClass {
    
    public static void main(String[] args) {
        if(FileClass.getInstance().createFile() && FileClass.getInstance().createReportFile()){
            MainController.getInstance();
        }
    }
}
