//TO DISPLAY SUM OF INT VALUE USING EXCPETION
package ExceptionHandling_Assignment;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        sum();                                   //calling method 
    }
        public static void sum(){
        int a=0;                                 //declaring a and b variables initially as 0
        int b=0;
        Scanner sc= new Scanner(System.in);       //reading the i/p from user
        try {
           a=sc.nextInt();                       //if we don't enter correct i/p it throws exception
           b=sc.nextInt();
           System.out.println(a+b); 
        } catch (Exception e) {
          System.out.println("Type correct input");     //exception is handled here
          sum();                                        //and again calls sum() method to enter correct i/p values
        }
        sc.close();
    }
}
