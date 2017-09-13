/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahandler;

/**
 *
 * @author jingang
 */
public class quickSort {
    private double array[];
    static private int length;
    static public int index[];
     
 
    public void sort(double[] inputArr) {
        
        
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        index=new int[length];
        for (int i=0; i<length; i++) index[i]=i;  
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
        
        
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        double pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
             
                
                exchangeNumbers(i, j);
               
              
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j) //loweri=0, j=1
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        /*
        for (int k=0; k<length; k++){
            System.out.print(array[k]+" ");
        }
        System.out.print("#################");
        */
        int temp1 = index[i];
        index[i] = index[j];
        index[j] = temp1;
        /*
         for (int k=0; k<length; k++){
            System.out.print(index[k]+" ");
         }
         System.out.println("#################");
         */
    }
     
    public static void main(String a[]){
         
        quickSort sorter;
        sorter = new quickSort();
        
        double[] input = {5,4,3,2,1}; 
        sorter.sort(input);
        for(double i:input){
            System.out.print(i);
            System.out.print(" ");
           
        }
        
        for(int i=0; i<length; i++){
            System.out.print(index[i]);
        }
            
        
        
    }
}
