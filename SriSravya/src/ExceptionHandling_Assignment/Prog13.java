//TO HANDLE ARTHIMETIC EXCEPTION
package ExceptionHandling_Assignment;

public class Prog13 {
    public static void main(String[] args) {
        int a=10, b=0;
        int result= 0;
        try {                                             
          result= a/b;                                          //ArithmeticException is caused
          System.out.println("Result is: " +result);  
        } catch (ArithmeticException ae) {                     //exception is handled here
            result= 10/2;
            System.out.println(result);
            System.out.println("You should not divide a number by zero");
            
        }
    }
}
