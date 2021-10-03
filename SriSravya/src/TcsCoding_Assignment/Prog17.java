package TcsCoding_Assignment;

import java.util.Scanner;

public class Prog17 {
    public static void addition(int number1, float number2) {        //method with passing 2 variables as arguments
        float result;
        result= number1 + number2;             //converts int to float internally as float is higher
        System.out.println("Sum of 2 numbers is: " +result);
    }
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.println("Number 1: ");             //reading the i/p values from user
        int number1= scannerObj.nextInt();
        System.out.println("Number 2: ");
        float number2= scannerObj.nextFloat();
        addition(number1, number2);               //calling method by passing i/p values as parameters

        scannerObj.close();
    }
}
