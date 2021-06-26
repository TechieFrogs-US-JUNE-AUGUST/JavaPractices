package Assignment.java;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b,c values");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        if(a>b && a>c) {
    System.out.println("a is greater");
        }
    else if(b>c) {
            System.out.println("b is greater");
        }
    else if (a==b && b==c)
    {
            System.out.println("a,b,c are equal");
        }
    else {
            System.out.println("c is greater");
    }sc.close();
    }
}