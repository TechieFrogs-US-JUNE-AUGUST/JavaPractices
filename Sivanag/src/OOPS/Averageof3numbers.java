package OOPS;

import java.util.Scanner;

class Average
{
void Avg(int a,int b,int c)
{
    System.out.println(("Average of Given Three numbers is : " + (a+b+c)/3));


}


}

public class Averageof3numbers {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter First Number"));
        int a=sc.nextInt();
        System.out.println(("Enter Second Number"));
        int b=sc.nextInt();
        System.out.println(("Enter Third Number"));
        int c=sc.nextInt();
        Average av = new Average();
        av.Avg(a,b,c);
        sc.close();
    }
    
}
