package tcscodingquestions;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter Number1");
        int num1=scannerObj.nextInt();
        System.out.println("Enter Number2");
        float num2=scannerObj.nextFloat();
        float num3=num1+num2;
        System.out.println("Sum :" +num3);
        scannerObj.close();
    }
    
}
