package Assignment.java;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        a = sc.nextInt();
        if (a % 2 ==0) {
            System.out.println("a is even");
        }
        else if(a%2 ==1)
        {
            System.out.println("a is odd");
        }else {
            System.out.println("undefined");
        }
        }
    }