package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 {
    static int inputMismatch()
    {
        int a=0;
        Scanner sc = new Scanner(System.in);
        try{
             
            a=sc.nextInt();
            return a;
          }catch(InputMismatchException e)
        {
            System.out.println("Enter the Positive Number");
            inputMismatch();
           
        }
        
        return a;       
    }
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter Input 1");
        a=inputMismatch();
        System.out.println("enter Input 2");
        b=inputMismatch();
        System.out.println("input 1:" +a);
        System.out.println("input 1:" +b);
        System.out.println(a+b);
        

    }
    
}
