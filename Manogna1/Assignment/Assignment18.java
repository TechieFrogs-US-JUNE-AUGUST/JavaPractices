package Assignment;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {

        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scannerObj.nextInt();
        System.out.println("Enter Second number");
        int num2=scannerObj.nextInt();
        long factorial=1;
        for(int i=num1;i<=num2;i++)
            factorial = factorial*i;
        System.out.println("Factorial of given number is " +factorial);
        scannerObj.close();
    }
    
}
