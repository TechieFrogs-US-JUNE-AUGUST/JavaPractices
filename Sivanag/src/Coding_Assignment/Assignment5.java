package src.Coding_Assignment;

import java.util.Scanner;

public class Assignment5 {
    static void perfectNumber(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==num)
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner scannerObject =new Scanner(System.in);
        System.out.println("Enter From Number:");
        int fromNumber = scannerObject.nextInt();
        System.out.println("Enter To NUmber :");
        int toNumber =scannerObject.nextInt();
        System.out.println("Perfect numbers between 5000 to 9000 are ");
        for(int i=fromNumber;i<=toNumber;i++)
        {
            perfectNumber(i);
        }
        scannerObject.close();
    }    
}
