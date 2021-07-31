//TO ILLUSTRATE NESTED TRY, CATCH AND FINALLY BLOCKS
package ExceptionHandling_Assignment;

public class Prog24 {
 public static void main(String[] args) {
     int a;
     int array[]= new int [5];
    try{
       array[6]= 20;                                 //ArrayIndexOutOfBounds Exception is caused
        System.out.println(array[6]);                                 
        }
    catch(ArrayIndexOutOfBoundsException aie){             //and the exception is handled here
         System.out.println("In Array Index Out of Bound Exception");  
        try {
         a= 10/0;                                 //Arthimetic exception is caused
        } catch (ArithmeticException ae) {                                    //Arthimetic excpetion is handled
            System.out.println("Division is Not Possible in Nested Catch block");
           }
        }
    finally{
        System.out.println("In finally block");
        }

    }
}
