/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camilo
 */
public class LectorCSV{
    
    ArrayList<String> datoUni;  
    BufferedReader br;
    String line;
    public LectorCSV(){
        datoUni = new ArrayList<>();
        line = "";
    }
    public void readCSV(String nombre) throws IOException{   
        
            br = new BufferedReader(new FileReader(nombre));
            while ((line = br.readLine())!=null){
                datoUni.add(line);
            }
        
    }
    
    public void printDatoUni(){
        System.out.println("-----------------------");
        for (String string : datoUni) {       
            System.out.println(string);        
        }
    }
    public ArrayList<String> getDatoUni() {
        return datoUni;
    }

    public void setDatoUni(ArrayList<String> datoUni) {
        this.datoUni = datoUni;
    }
    
}
