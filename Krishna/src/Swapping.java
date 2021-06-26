package Assignment.java;
import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b values");
a= sc.nextInt();
b= sc.nextInt();
        System.out.println("before swapping a=" +a+ " b=" +b);
c=a;
a=b;
b=c;
        System.out.print("after swapping a=" +a+ " b= " +b);
        //System.out.println();
    }
}
