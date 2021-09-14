package src.Coding_Assignment;

import java.util.Scanner;

public class Assignment18 {
    static int fact(int num)
    {
        if(num>9)
        {
            if((num/10)%2!=0)
            return (4*fact(num/5)*fact(num%10));
            else
            return (6*fact(num/5)*fact(num%10));
        }else
        {
            int n1=1;
        for(int i=num;i>0;i--)
        {
            n1=n1*i;
        }
        return n1;
        }
    }
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num =scannerObj.nextInt();
        System.out.println("Factorial of " + num + " is : " + fact(num));

        scannerObj.close();
    }
    
}
