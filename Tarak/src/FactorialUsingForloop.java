

import java.util.Scanner;

public class FactorialUsingForloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        do {
            System.out.println("enter positive number: ");
            while (!sc.hasNextInt())
            {
                System.out.println("This is not a number. Please enter number");
                sc.next();
            }
            n=sc.nextInt();
        }while (n<=0);
        System.out.println("it is a positive number: "+n);
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("factorial of given number is " +factorial);

    }
}
