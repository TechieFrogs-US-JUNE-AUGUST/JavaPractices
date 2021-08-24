package src.Tcs_Assignment;

import java.util.Scanner;
public class Assignment12 {
    static boolean prime(int num)
    {
        for(int i=2;i<10;i++)
        {
            if(num!=i)
            {
                if(num%i==0)
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number:");
        int num;
        do
        {
            while(!sc.hasNextInt())
            {
                System.out.println("Enter Positive Number");
                sc.next();
            }
            num=sc.nextInt();
        }while(num<0);
        if(prime(num))
            System.out.println(num +" is a Prime number");
        else
        System.out.println(num +" is not a Prime number");
        sc.close();
    }
 }
