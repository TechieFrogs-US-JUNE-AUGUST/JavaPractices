package src.Coding_Assignment;

import java.util.Scanner;

public class Assignment11 {
    static int factorial(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    static int checkFact(int num)
    {
        // System.out.println(factorial(num));
        // System.out.println(factorial(factorial(num)));
        if(factorial(num)==factorial(factorial(num)))
        return 1;
        else
        return 0;
    }
    public static void main(String[] args) {
        Scanner scannerObject =new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = scannerObject.nextInt();
        System.out.println(checkFact(num));
        scannerObject.close();

    }

    
}
