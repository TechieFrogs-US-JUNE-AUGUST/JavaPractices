package Exceptions;

import java.util.Scanner;

public class Exception15 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        int arraySize=-5;   
        int i;                                 
        try {
            int array[]= new int[arraySize];                 //initialising an array
            for( i=0;i<arraySize;i++)
            {
                array[i]=scannerObj.nextInt();
                
            }   
           
        } 
        catch (NegativeArraySizeException nae) {            //Exception is handled here
            System.out.println("We cannot create array of negative size");
        }finally{
            scannerObj.close();
        }
    }
    
}
