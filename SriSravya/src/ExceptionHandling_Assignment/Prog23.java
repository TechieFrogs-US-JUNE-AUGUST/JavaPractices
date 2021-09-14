//TO ILLUSTRATE TRY, CATCH AND FINALLY BLOCKS
package ExceptionHandling_Assignment;

public class Prog23 {
   public static void main(String[] args) {
       int array[]= new int[10];
       try {
           int i= array[10];                             //exception is caused because array is assigned to int variable
           System.out.println(i);
           System.out.println("In try block");             //this never executes if any exception is raised before this statement
       } 
       catch (ArrayIndexOutOfBoundsException aie) {
           System.out.println("In Array Index Out of Bound Exception" +aie);
       }
       finally{
           System.out.println("Finally block prints even if the exception is occured");
       }
   } 
}
