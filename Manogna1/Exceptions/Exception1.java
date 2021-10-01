package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {//sum of two integers
    public static void main(String[] args) {
        int a,b,c;
        Scanner scannerObj=new Scanner(System.in);
        try{
            a=scannerObj.nextInt();
            b=scannerObj.nextInt();
            //c=a+b;
           // System.out.println(c);
        }catch(InputMismatchException e) //instead of integer if we give any other inputs it will throw input mismatch exception
        {
            a=10;b=15;
             c=a+b;
            System.out.println(c);
        }
        finally{
            scannerObj.close();
        }
    }
    
}
