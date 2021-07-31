//TO USE FINALLY BLOCK FOR CATCHING EXCEPTIONS
package ExceptionHandling_Assignment;

public class Prog25 {
   public static void main(String[] args) {
       try {
           int a= 25/0;                                          //Arthimetic exception is caused
           System.out.println(a);
       } catch (ArithmeticException ae) {                         //it is handled here generally
           System.out.println("EXception is handled here " +ae);
       }
       finally{                                                    //finally block is always executed irrespective of exception
           System.out.println("Finally block is always executed");
           int a=25/5;                                            //but in finally block it is resolved
           System.out.println(a);
       }
       System.out.println("Rest of the code");
   } 
}
