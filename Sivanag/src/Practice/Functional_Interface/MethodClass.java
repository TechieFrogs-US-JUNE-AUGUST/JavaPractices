package Practice.Functional_Interface;

import java.util.Random;

public class MethodClass {
    public static String isEvenOdd(int n)
    {
        if(n%2==0)
            return n + " is Even Number";
            else
            return n + " is Odd Number";

    }
    public static String multiTwonumbers(int n1,int n2)
    {
        return "Multiplication of " + n1 + " and " + n2 + " is " + n1*n2;
    }
    public static void isPrime(int n)
    {
        int k=0;
        for(int j=1;j<n-1;j++)
        {
            if(n%j==0 && j!=1)
            k=1;
        }
        if(k==0)
        System.out.print(n +" is a Prime Number ");
        else
        System.out.println(n + " is not a Prime Number");
    }
    public static void greaterThen(int n1,int n2)
    {
        if (n1>n2)
        System.out.println(n1 +" is greater than " + n2);
        else
        System.out.println(n2 +" is greater than or equal " + n1);
    }
    public static boolean isEven(int n)
    {
        if(n%2==0)
            return true;
            else
            return false;
    }
    public static boolean stringCompare(String s1,String s2)
    {
        if(s1.equals(s2))
        return true;
        else 
        return false;

    }
    public static Integer getnumber(int n1)
    {
        // int r = new Random().nextInt(100);
        // if(r<10)
        // return 10;
        return n1;
    }
    
}
