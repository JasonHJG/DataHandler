/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahandler;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.*;

/**
 *
 * @author jingang
 */



public class DataHandler {
   
   // parameters
   static int debugger=0;
   static private String[] date;
   static private double[] open;
   static private double[] high;
   static private double[] low;
   static private double[] close;
   static private double[] volume;
   static private double[] adjClose;
   
   // return the number of lines in the file
    static private int countLines(String file) throws IOException {
    int lines = 0;

       try (FileInputStream fis = new FileInputStream(file)) {
           int BUFFER_SIZE = 8 * 1024;
           byte[] buffer = new byte[BUFFER_SIZE]; // BUFFER_SIZE = 8 * 1024
           int read;
           
           while ((read = fis.read(buffer)) != -1) {
               for (int i = 0; i < read; i++) {
                   if (buffer[i] == '\n') lines++;
               }
           }  }

    return lines;
   } 

    
// read the file into the arrays 
// return number of lines (except heading)    
  private static int readfile(String filename) throws IOException {
      // initilization
    
      int lines = countLines(filename);
      date=new String[lines-1];
      open=new double[lines-1];
      high=new double[lines-1];
      low=new double[lines-1];
      close=new double[lines-1];
      volume=new double[lines-1];
      adjClose=new double[lines-1];
      
      // assignment
       
      String csvFile=filename;
      String line="";
      String cvsSplitBy = ",";
      try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
          
         int index=0;
          while ((line = br.readLine()) != null) {
          String[] stock = line.split(cvsSplitBy);
          
          if (index!=0){
          date[index-1]=stock[0];
          open[index-1]=new Double(stock[1]);
          high[index-1]=new Double(stock[2]);
          low[index-1]=new Double(stock[3]);
          close[index-1]=new Double(stock[4]);
          volume[index-1]=new Double(stock[5]);
          adjClose[index-1]=new Double(stock[6]);
          }
          index++;
        }
    

  }  
      if (debugger==1){
          for (int i=0; i<lines-1; i++){
      System.out.println("#######################");
      System.out.println("dates "+date[i]);
      System.out.println("open "+open[i]);
      System.out.println("high  "+high[i]);
      System.out.println("low  "+low[i]);
      System.out.println("close  "+close[i]);
      System.out.println("volume  "+volume[i]);
      System.out.println("adjClose  "+adjClose[i]);
      
          
          
          
          }}
      return lines-1;
  }
  
  

  
  
  public static void loadPricaData(String filename, String method, String preference) throws IOException{
         readfile(filename);
  }
  
  
    public static void main(String[] args) throws IOException{
           readfile("/Users/jingang/Desktop/corrections.csv");
    }    
  
    
}
