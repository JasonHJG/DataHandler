/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahandler;

import static datahandler.quickSort.index;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.*;
import java.util.*;
import java.lang.Math;



/**
 *
 * @author jingang
 */



public class DataHandler {
   
   
   
   static int duration;
   //static int lines;
   static private String[] date;
   static private double[] dateInNum;
   static private double[] open;
   static private double[] high;
   static private double[] low;
   static private double[] close;
   static private double[] volume;
   static private double[] adjClose;
   
   
   public DataHandler(){
}

   
   
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

     //convert string arr to int array
  public static double[] stringConvert(String[] date){
      int len=date.length;
      double dateArr[]=new double[len]; 
      double day;
      double month;
      double year;
      double total;
      for(int i=0; i<len; i++){
          String str[] = date[i].split("/");
          
           month = 1.0*Integer.parseInt(str[0]);
           //System.out.println(day);
           day = 1.0*Integer.parseInt(str[1]);
           //System.out.println(month);
           year = 1.0* Integer.parseInt(str[2]);
           //System.out.println(year);
          
          total=day+ 50*month +50*20*year;
          dateArr[i]=total;
          
      }
      return dateArr;
  }
/// read the file into the arrays  
 // return the length of the array   
  private static int readfile( String filename) throws IOException {
      // initilization
    
      int lines = countLines(filename);
      
      date=new String[lines-1];
      open=new double[lines-1];
      high=new double[lines-1];
      low=new double[lines-1];
      close=new double[lines-1];
      volume=new double[lines-1];
      adjClose=new double[lines-1];
      dateInNum= new double[lines-1];
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
      dateInNum=stringConvert(date);
      duration= lines-1;
      return lines-1;
      
  }
  
  
 
  
  // implement the bubbleSort method
  public static int[] bubbleSort(double arr[]){
      int n = arr.length;
      int index[]=new int[n];
      for (int i=0; i!=n; i++) index[i]=i;
      
      
      
      for (int i = 0; i < n-1; i++)
          for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    
                    int temp2 = index[j];
                    index[j] = index[j+1];
                    index[j+1] = temp2;
                    
                }
      return index;
  }
  
  
  // rearrange the array according to the order
  public static void shuffleArray(double target[],int order[]){
      int length=order.length;
      double target2[];
      target2 = new double[length];
      for (int i=0; i<length;i++){
          target2[i]=target[order[i]];
      }
      for (int j=0;j<length;j++)
      target[j]= target2[j];
  }
  
  //rearrange array according to the order
  public static void shuffleArray2(String target[],int order[]){
      int length=order.length;
      String target2[];
      target2 = new String[length];
      for (int i=0; i<length;i++){
          target2[i]=target[order[i]];
      }
      for (int j=0;j<length;j++)
      target[j]= target2[j];
  }
  
  public static void reverseArray(double target[]){
      int length=target.length;
      int order[]=new int[length];
      for (int i=0; i<length; i++){
          order[i]=length-1-i;
      }
      shuffleArray(target,order);
  }
  
  public static void reverseArray2(String target[]){
      int length=target.length;
      int order[]=new int[length];
      for (int i=0; i<length; i++){
          order[i]=length-1-i;
      }
      shuffleArray2(target,order);
  }
  
  // preference is a string array [ascending/descening, criterion]
  public static void loadPricaData(String filename, String method, String[] preference) throws IOException{
         int length=readfile(filename);
         
         switch (preference[1]){
             case "date":
             {
               if(preference[0]=="ascending"){
                   if(method=="quicksort"){
                       quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(dateInNum);
                            int[] order=sorter.index;
                            shuffleArray(open,order);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                             
                   }
                   else if(method=="bubblesort"){
                       int order[]=bubbleSort(dateInNum);
                            shuffleArray(open,order);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                       
                   }
               }
               else if(preference[0]=="descending"){
                   if(method=="quicksort"){
                       quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(dateInNum);
                            int[] order=sorter.index;
                            shuffleArray(open,order);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            
                            reverseArray(dateInNum);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray2(date);
                             
                   }
                   else if(method=="bubblesort"){
                       int order[]=bubbleSort(dateInNum);
                            shuffleArray(open,order);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            
                            
                            reverseArray(dateInNum);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray2(date);
                       
                   }
               }
                   
               
             }
                 
                 
                 break;
             case "open":{
                 if (preference[0]=="ascending"){

                        if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(open);
                            int[] order=sorter.index;
                            shuffleArray(dateInNum,order);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(open);
                            shuffleArray(dateInNum,order);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                        
                        
                        }
                        
                 
                 
                 
                 
                 }
                 else if(preference[0]=="descending"){
                       if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(open);
                            int[] order=sorter.index;
                            shuffleArray(dateInNum,order);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            reverseArray(dateInNum);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray2(date);
                            
                            
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(open);
                            shuffleArray(dateInNum,order);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            reverseArray(dateInNum);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray2(date);
                        
                        }
                 }
                 
             }  
             break;
             case "high":{
                     if (preference[0]=="ascending"){

                        if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(high);
                            int[] order=sorter.index;
                            shuffleArray(dateInNum,order);
                            shuffleArray(open,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(high);
                            shuffleArray(dateInNum,order);
                            shuffleArray(open,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                        
                        
                        }
                        
                 
                 
                 
                 
                 }
                 else if(preference[0]=="descending"){
                       if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(high);
                            int[] order=sorter.index;
                            shuffleArray(dateInNum,order);
                            shuffleArray(open,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            reverseArray(dateInNum);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray2(date);
                            
                            
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(high);
                            shuffleArray(dateInNum,order);
                            shuffleArray(open,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray(dateInNum);
                            reverseArray2(date);
                        
                        }
                 }
                 
             }
             break;
                 
             case "low":{if (preference[0]=="ascending"){

                        if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(low);
                            int[] order=sorter.index;
                            shuffleArray(dateInNum,order);
                            shuffleArray(high,order);
                            shuffleArray(open,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(low);
                         shuffleArray(dateInNum,order);
                            shuffleArray(high,order);
                            shuffleArray(open,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                        
                        
                        }
                        
                 
                 
                 
                 
                 }
                 else if(preference[0]=="descending"){
                       if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(low);
                            int[] order=sorter.index;
                            shuffleArray(dateInNum,order);
                            shuffleArray(high,order);
                            shuffleArray(open,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray(dateInNum);
                            reverseArray2(date);
                            
                            
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(low);
                         shuffleArray(dateInNum,order);
                            shuffleArray(high,order);
                            shuffleArray(open,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray(dateInNum);
                            reverseArray2(date);
                        
                        }
                 }
                 
                 
             }
             break;
             case "close":{if (preference[0]=="ascending"){

                        if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(close);
                            int[] order=sorter.index;
                            shuffleArray(dateInNum,order);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(open,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(close);
                            shuffleArray(high,order);
                            shuffleArray(dateInNum,order);
                            shuffleArray(low,order);
                            shuffleArray(open,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                        
                        
                        }
                        
                 
                 
                 
                 
                 }
                 else if(preference[0]=="descending"){
                       if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(close);
                            int[] order=sorter.index;
                            shuffleArray(high,order);
                            shuffleArray(dateInNum,order);
                            shuffleArray(low,order);
                            shuffleArray(open,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            reverseArray2(date);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray(dateInNum);
                            
                            
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(close);
                         shuffleArray(dateInNum,order);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(open,order);
                            shuffleArray(volume,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            reverseArray2(date);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                        reverseArray(dateInNum);
                            
                        }
                 }
                 
                 
             }
             break;
             case "volume":{if (preference[0]=="ascending"){

                        if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(volume);
                            int[] order=sorter.index;
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(open,order);
                            shuffleArray(adjClose,order);
                              shuffleArray2(date,order);
                              shuffleArray(dateInNum,order);
                            
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(volume);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(open,order);
                            shuffleArray(adjClose,order);
                              shuffleArray2(date,order);
                              shuffleArray(dateInNum,order);
                            
                        
                        
                        }
                        
                 
                 
                 
                 
                 }
                 else if(preference[0]=="descending"){
                       if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(volume);
                            int[] order=sorter.index;
                            shuffleArray(high,order);
                            shuffleArray(dateInNum,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(open,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            reverseArray2(date);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray(dateInNum);
                            
                            
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(volume);
                         shuffleArray(dateInNum,order);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(open,order);
                            shuffleArray(adjClose,order);
                            shuffleArray2(date,order);
                            reverseArray2(date);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray(dateInNum);
                        
                        }
                 }
                 
                 
             }
             break;
             case "adjClose":
             {
                 if (preference[0]=="ascending"){

                        if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(adjClose);
                            int[] order=sorter.index;
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(open,order);
                              shuffleArray2(date,order);
                              shuffleArray(dateInNum,order);
                            
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(adjClose);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(open,order);
                              shuffleArray2(date,order);
                              shuffleArray(dateInNum,order);
                            
                        
                        
                        }
                        
                 
                 
                 
                 
                 }
                 else if(preference[0]=="descending"){
                       if(method=="quicksort"){
                            quickSort sorter;
                            sorter = new quickSort();
                            sorter.sort(adjClose);
                            int[] order=sorter.index;
                            shuffleArray(high,order);
                            shuffleArray(dateInNum,order);
                            shuffleArray(low,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(open,order);
                              shuffleArray2(date,order);
                            reverseArray2(date);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray(dateInNum);
                            
                            
                             
                            
                        }
                        else if(method=="bubblesort"){
                        
                         int order[]=bubbleSort(adjClose);
                            shuffleArray(high,order);
                            shuffleArray(low,order);
                            shuffleArray(dateInNum,order);
                            shuffleArray(close,order);
                            shuffleArray(volume,order);
                            shuffleArray(open,order);
                              shuffleArray2(date,order);
                            reverseArray2(date);
                            reverseArray(open);
                            reverseArray(high);
                            reverseArray(low);
                            reverseArray(close);
                            reverseArray(volume);
                            reverseArray(adjClose);
                            reverseArray(dateInNum);
                        
                        }
                 }
                 
             }
                 break;
            default :
            System.out.println("Invalid criterion");

                 
                 
                     

         
         }
  
  }
  
   public static double[][] getPrices(String start, String end) throws IOException{
       
       // determine the order
       int ascending=0;
       if (dateInNum[0]<dateInNum[1]) {ascending=1;}
       
      
       
       // need to detect the exact date
          String str1[] = start.split("/");
        
          double month = 1.0*Integer.parseInt(str1[0]);
          double day = 1.0*Integer.parseInt(str1[1]);
          double year = 1.0* Integer.parseInt(str1[2]);
          
          double startNum=day+ 50*month +50*20*year;
          
          String str2[] = end.split("/");
        
          month = 1.0*Integer.parseInt(str2[0]);
          day = 1.0*Integer.parseInt(str2[1]);
          year = 1.0* Integer.parseInt(str2[2]);
          
          double endNum=day+ 50*month +50*20*year;
          //System.out.println(endNum);
          // find their position in the array
       int indicateStart=0;
       int indicateEnd=0;
      
      
       //ascending
       if (ascending==1){
           while(startNum>dateInNum[indicateStart]){
               indicateStart++;
               //System.out.println(date[indicateStart]);
           }
           while(endNum>dateInNum[indicateEnd]){
               indicateEnd++;
               //System.out.println(date[indicateEnd]);
           }
           
       }
       
       else if (ascending==0){
           while(startNum<dateInNum[indicateStart]){
               indicateStart++;
           }
           while(endNum<dateInNum[indicateStart]){
               indicateEnd++;
           }
           
       }
       
        int startPos=indicateStart;
        int endPos=indicateEnd;
        
        for (int i=startPos; i<=endPos;i++){
            System.out.println(date[i]);
        }
         
       int len;
       
       len = Math.abs(endPos-startPos)+1;
       double[][] priceArr = new double[6][len];
       if (startPos <=  endPos){
       //System.out.println(len);
       for (int j=startPos; j<=endPos; j++){
           priceArr[0][j-startPos]=open[j];
           priceArr[1][j-startPos]=high[j];
           priceArr[2][j-startPos]=low[j];
           priceArr[3][j-startPos]=close[j];
           priceArr[4][j-startPos]=volume[j];
           priceArr[5][j-startPos]=adjClose[j];
           
                   
       }}
       else if (startPos>endPos) {
           
           for (int j=startPos; j>=endPos; j--){
           priceArr[0][startPos-j]=open[j];
           priceArr[1][startPos-j]=high[j];
           priceArr[2][startPos-j]=low[j];
           priceArr[3][startPos-j]=close[j];
           priceArr[4][startPos-j]=volume[j];
           priceArr[5][startPos-j]=adjClose[j];
           
                   
       }
         
       }
       
       return priceArr;
       
   }
  
   public static double [] computeMax(String from, String to) throws IOException{
       double[][] priceArr= getPrices(from, to);
       int len=priceArr[0].length;
       double [] max=new double [6];
     
       for (int j=0; j<6;j++){
           max[j]=0;
           for(int k=0; k<len;k++)
           {
               if (max[j]< priceArr[j][k])
                   max[j]=priceArr[j][k];
                   
           }
           
       }
       
       return max;
       
   }
   
   
   
   public static double[][] computeMovingAverage(String from, String to, int windowSize) throws IOException{
       double [][] priceArr= getPrices(from ,to);
       int len=priceArr[0].length;
       double [][] movingAve= new double[6][len-windowSize+1];
       
       for (int i=0; i<6; i++){
           for (int j=0; j<len-windowSize+1; j++){
               double sum=0;
               for(int k=j;k<windowSize+j; k++){
                   
                   sum+=priceArr[i][k];
               }
               movingAve[i][j]=sum/windowSize;
           }
       }
       
     return movingAve;
   }
   //priceArr has size 6*len
   public static double [] computeAverage(String from, String to) throws IOException{
       double[][] priceArr= getPrices(from, to);
       int len=priceArr[0].length;
       double [] aveArr=new double [6];
       
       for (int j=0; j<6;j++){
           aveArr[j]=0;
           for(int k=0; k<len;k++)
           {
               aveArr[j]+=priceArr[j][k];
           }
           aveArr[j] /= len;
       }
       
       return aveArr;
   }
    
  
   
  // record has open, high, low, close, vol, adjclose 6x1 array 
   public static void insertPrice(String specDate, double []record ){
       
      
      
          String str[] = specDate.split("/");
          //check the order of the array
          // ascending small date to large date
          int ascending=0;
          if (dateInNum[0]<dateInNum[1]) {ascending=1;}
 
          double month = 1.0*Integer.parseInt(str[0]);
          double day = 1.0*Integer.parseInt(str[1]);
          double year = 1.0* Integer.parseInt(str[2]);
          
          double total=day+ 50*month +50*20*year;
          
     
          
          //System.out.println(date.length);
          
          //System.out.println(dateInNum.length);
          
          // find where is total in dateInNum
          // stops at pos i
          int i=0; 
          int j=0;//flag for equal
          if(ascending==1){
              while(total > dateInNum[i]){
                  
                  i++;}
              
              if (total== dateInNum[i])
                  j=1;
          }
          else if(ascending==0){
              while(total < dateInNum[i])
                  i++;
              
              if (total== dateInNum[i])
                  j=1;
          }
     
         // insert the new string
         if (j==1){
             date[i]=specDate;
             open[i]=record[0];
             high[i]=record[1];
             low[i]=record[2];
             close[i]=record[3];
             volume[i]=record[4];
             adjClose[i]=record[5];
             dateInNum[i]=total;
             
         }
         // insert the date
         if(j==0){
             String[] dateCopy = Arrays.copyOf(date, date.length);
             double[] openCopy=Arrays.copyOf(open, open.length);
             double[] highCopy=Arrays.copyOf(high, high.length);
             double[] lowCopy=Arrays.copyOf(low, low.length);
             double[] closeCopy=Arrays.copyOf(close, close.length);
             double[] volumeCopy= Arrays.copyOf(volume, volume.length);
             double[] adjCloseCopy=Arrays.copyOf(adjClose, adjClose.length);
             double[] dateInNumCopy=Arrays.copyOf(dateInNum, dateInNum.length);
             
       
             date=Arrays.copyOf(date, date.length+1);
             open=Arrays.copyOf(open, open.length+1);
             high=Arrays.copyOf(high, high.length+1);
             low=Arrays.copyOf(low, low.length+1);
             close=Arrays.copyOf(close, close.length+1);
             volume=Arrays.copyOf(volume ,volume.length+1);
             adjClose=Arrays.copyOf(adjClose,adjClose.length+1);
             dateInNum=Arrays.copyOf(dateInNum,dateInNum.length+1);
             
      
              
             for (int k=0; k<i; k++){
             date[k]=dateCopy[k];
             open[k]=openCopy[k];
             high[k]=highCopy[k];
             low[k]=lowCopy[k];
             close[k]=closeCopy[k];
             volume[k]=volumeCopy[k];
             adjClose[k]=adjCloseCopy[k];
             dateInNum[k]=dateInNumCopy[k];  
         }
             
             
       
             
             
             for (int k=i+1; k<close.length; k++){
             date[k]=dateCopy[k-1];
             open[k]=openCopy[k-1];
             high[k]=highCopy[k-1];
             low[k]=lowCopy[k-1];
             close[k]=closeCopy[k-1];
             volume[k]=volumeCopy[k-1];
             adjClose[k]=adjCloseCopy[k-1];
             dateInNum[k]=dateInNumCopy[k-1];  
         }
             
              
             
             date[i]=specDate;;
             open[i]=record[0];
             high[i]=record[1];
             low[i]=record[2];
             close[i]=record[3];
             volume[i]=record[4];
             adjClose[i]=record[5];
             dateInNum[i]=total;
             
             
             
         }
      
      
  }  
      
   
   
   public static void correctPrices(String filename) throws IOException{
       int lines = countLines(filename);
       int num=lines-1;
      String[] dateSub=new String[lines-1];
      double[][] container=new double[num][6];
      double[] dateInNumSub= new double[lines-1];
      // assignment
       
      String csvFile=filename;
      String line="";
      String cvsSplitBy = ",";
      try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
          
         int index=0;
          while ((line = br.readLine()) != null) {
          String[] stock = line.split(cvsSplitBy);
          
          if (index!=0){
              
          
          
          dateSub[index-1]=stock[0];
          container[index-1][0]=new Double(stock[1]);
          container[index-1][1]=new Double(stock[2]);
          container[index-1][2]=new Double(stock[3]);
          container[index-1][3]=new Double(stock[4]);
          container[index-1][4]=new Double(stock[5]);
          container[index-1][5]=new Double(stock[6]);
          
          
          }
          index++;
        }
    

  }  
      //dateInNumSub=stringConvert(date);
      for (int i=0; i<num; i++){
       insertPrice(dateSub[i], container[i]);   
      }
      
   }
  
    public static void main(String[] args) throws IOException{
        DataHandler myDataHandler = new DataHandler();
        //myDataHandler.readfile("/Users/jingang/Desktop/prices.csv");
        
        int lines=myDataHandler.readfile("/Users/jingang/Desktop/prices.csv");
        myDataHandler.loadPricaData("/Users/jingang/Desktop/prices.csv", "quicksort", new String[] {"ascending","date"});
         
        myDataHandler.correctPrices("/Users/jingang/Desktop/corrections.csv");
        
       /*
         System.out.println("get price");
        double[][] price=myDataHandler.getPrices("8/16/2004","8/20/2004");
        int len=price[0].length;
        
        for (int i=0;i<len;i++){
            for (int j=0;j<6;j++){
                System.out.print(price[j][i]+" ");
            }
            System.out.println("");
        }
        
       System.out.println("average price"); 
       double[] ave= myDataHandler.computeAverage("08/15/2004","09/15/2004");
       int len=ave.length;
       for (int i=0;i<len;i++){
           System.out.print(ave[i]+" ");
       }
        
        
       System.out.println("max price"); 
        double[] max= myDataHandler.computeMax("04/15/2004","06/15/2004");
       int len=max.length;
       for (int i=0;i<len;i++){
           System.out.print(max[i]+" ");
       }
       
       */
        System.out.println("moving average price"); 
        double[][] movingAve= myDataHandler.computeMovingAverage("08/15/2004","09/15/2004",10);
       int len=movingAve[0].length;
       for (int i=0;i<len;i++){
           for (int j=0; j<6; j++){
           System.out.print(movingAve[j][i]+" ");}
            System.out.println("");

       
       }
      
    }
        
      
    
}
