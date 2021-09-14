package Exceptions;

import java.util.Scanner;

public class Exception14 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        int n=scannerObj.nextInt();
        int array[]=new int[n];
        try{
            for(int i=0;i<n;i++)
            {
                array[i]=scannerObj.nextInt();
            }   
            System.out.println(array[3]);
        }catch(ArrayIndexOutOfBoundsException aie)
            {   
                System.out.println("Array index out of Bounds ");
                
            }
        
        finally
         {
             scannerObj.close();
         }  
        
    }
    
}
