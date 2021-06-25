

import java.util.Scanner;

public class GcdUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        while (a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("gcd is "+a);
    }

}


