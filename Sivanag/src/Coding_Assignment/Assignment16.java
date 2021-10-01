package src.Coding_Assignment;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num =scannerObj.nextInt();
        int refVariable=num;
        int sumEven=0,temp;
        int sumOdd=0;
        while(num>0)
        {   
            temp=num%10;
            if(temp%2==0)
            sumEven+=temp;
            else
            sumOdd+=temp;
            num=num/10;

        }
        System.out.println("Sum of Even numbers in " +refVariable+ " is: " +sumEven );
        System.out.println("Sum of Odd numbers in " +refVariable+ " is: " +sumOdd );

        scannerObj.close();
    }
    
}
