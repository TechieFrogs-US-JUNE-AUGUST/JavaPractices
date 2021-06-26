package Assignment.java;
import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num value");
        int num=sc.nextInt();
        do {
            System.out.println("enter the positive number:");
            while(!sc.hasNextInt())
            {
                System.out.println("this is not a number, please enter number");
                sc.next();
            }
           num= sc.nextInt();
        }while(num<=0);
        System.out.println("it is a number:" + num);
        int rev=0,rem;
        int t=num;
        while(t!=0) {
            rem = t % 10;
            rev = rev * 10 + rem;
            t = t / 10;
        }
        if(num==rev){
            System.out.println(num+ " is a palindrome.");
        }else
            System.out.println(num+ " is not a palindrome.");
        sc.close();
        }
    }