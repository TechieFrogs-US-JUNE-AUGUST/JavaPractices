package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception6 { //nested try
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        int n,i,a,b,c;
        n=scannerObj.nextInt();
        int array[]=new int[n];
        try{
            for(i=0;i<n;i++)
            {
                array[i]=scannerObj.nextInt();
            }   
            System.out.println(array[1]); //if n value is less than 2 it gives Array index out of bounds exception
        
          try{
                a=scannerObj.nextInt();
                b=scannerObj.nextInt();// if we didnt give integer values it gives input mismatch
          
          try{
              c=10/0;
              System.out.println(c);
          }catch(ArithmeticException ae)
          {
              c=10/5;
              System.out.println(c);
          }  
         } catch(InputMismatchException ie)
          {
              a=10;
              b=2;
              System.out.println(a/b);
           }
        }
        
            catch(ArrayIndexOutOfBoundsException aie)
                    {
                        System.out.println("Array index out of Bounds ");
                    }
                
                finally
                 {
                     scannerObj.close();
                 }
                
        
    }

    
}
