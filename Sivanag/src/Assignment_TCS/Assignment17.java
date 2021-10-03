

import java.util.Scanner;

public class Assignment17 {
    static double sum(int num1,float num2)
    {
        double sum=num1+num2;
        return sum;
    }
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Number1 :");
     int num1=sc.nextInt();
     System.out.print("Enter Number2 :");
     float num2=sc.nextFloat();
     
     System.out.println("Number 1 :" +num1);
     System.out.println("Number 2 :" +num2);
     System.out.println("Sum : " +sum(num1, num2));
     sc.close();
     
 }
    
}
