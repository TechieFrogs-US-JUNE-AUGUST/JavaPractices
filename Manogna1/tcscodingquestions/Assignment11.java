package tcscodingquestions;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter Input");
        int year=scannerObj.nextInt();
        if(((year%4==0) && (year%100!=0)) || (year%400==0))
        {
            System.out.println("Enetred year is a Leap Year");
        }
        else
        System.out.println("It is not a leap year");
        scannerObj.close();
    }
    
}
