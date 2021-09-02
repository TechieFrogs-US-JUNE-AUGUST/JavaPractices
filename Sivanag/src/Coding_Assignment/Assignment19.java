package src.Coding_Assignment;

import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.print("Enter Odd number from : ");
        int from=scannerObject.nextInt();
        System.out.print("Enter Odd NUmber to : ");
        int to =scannerObject.nextInt();
        int sum=0;
        for(int i=from;i<to;i++)
        {
            if(i%2!=0)
                sum+=i;
        }
        System.out.println("Sum of Odd number between " + from + "to " + to + " is: " + sum );
        scannerObject.close();
    }
    
}
