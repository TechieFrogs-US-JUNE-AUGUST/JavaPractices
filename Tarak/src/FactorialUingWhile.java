

import java.util.Scanner;

public class FactorialUingWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number");
        int i=1;
        int factorial=1;
        int num=sc.nextInt();
        while (i<=num){
            factorial=factorial*i;
            i++;
        }
        System.out.println("factorial is " +factorial);
    }
}
