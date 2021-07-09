
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num2=sc.nextInt();
        long factorial=1;
        for(int num1=1;num1<=num2;num1++)
            factorial = factorial*num1;
        System.out.println("Factorial of given number is " +factorial);
    }
}
