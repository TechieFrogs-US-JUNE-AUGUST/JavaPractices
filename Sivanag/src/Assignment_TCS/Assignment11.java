package src.Tcs_Assignment;

import java.util.Scanner;

public class Assignment11 {
    static boolean checkStep1(int num)
    {
        if(num%4==0)
            return true;
        else
            return false;
    }
    static boolean checkStep2(int num)
    {
        if(num%100==0)
            return true;
        else
            return false;
    }
    static boolean checkStep3(int num)
    {
        if(num%400==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Enter the Year to check :");
        int num=scannerObject.nextInt();
        if(checkStep1(num) && checkStep2(num) && checkStep3(num))
            System.out.println(num + " is a Leap year");
        else
            System.out.println(num + " is not a Leap year");
        scannerObject.close();

    }
}
