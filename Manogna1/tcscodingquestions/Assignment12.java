package tcscodingquestions;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter A Number");
        int n=scannerObj.nextInt();
        Assignment12 obj=new Assignment12();
        obj.check(n);
        scannerObj.close();
    }
    void check (int n)
    {
        if(n<0)
        {
            System.out.println("Enter a Positive Number");
        }
        else
        prime(n);
    }
    void prime(int n)
    {
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count>=1)
        {
            System.out.println("Entered Number is Not PRIME ");
        }
        else
        {
            System.out.println("Entered Number is a PRIME ");
        }
    }
}
