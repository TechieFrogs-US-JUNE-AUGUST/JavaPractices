package Exceptions;

public class Exception13 {
    public static void main(String[] args) {
        int a=20, b=0;
        int result= 0;
        try {                                             
          result= a/b;                                          //ArithmeticException is caused
          System.out.println("Result is: " +result);  
        } catch (ArithmeticException ae) {                     
            System.out.println("You should not divide a number by zero");
            result= 10/5;
            System.out.println("Result is : " +result);
            
        }
    }
    
}
