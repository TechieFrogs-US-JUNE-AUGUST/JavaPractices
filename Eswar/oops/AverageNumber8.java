package oops;

import java.util.Scanner;

class Average{

    void avg(int a,int b,int c){
        int d=(a+b+c)/3;
        System.out.println("Average of Three Numbers : " +d);
    }
}

public class AverageNumber8 {
    
    public static void main (String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a= sc.nextInt();
        System.out.println("Enter b value");
        int b= sc.nextInt();
        System.out.println("Enter c value");
        int c= sc.nextInt();
        Average av=new Average();
        av.avg(a, b, c);
        sc.close();

    }
}
