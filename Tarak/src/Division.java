

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b values");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=b/a;
        int d=b%a;
        System.out.println("a/b= "+c);
        System.out.println("a%b= "+d);
    }
}
