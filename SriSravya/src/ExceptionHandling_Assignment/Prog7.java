//TO USE CATCH TO HANDLE CHAINED EXCEPTION
package ExceptionHandling_Assignment;

public class Prog7 {
    public static void main(String[] args) {
        try {
            NumberFormatException nfe= new NumberFormatException("Exception");         //creating an exception
            nfe.initCause(new NullPointerException("This is the actual cause of exception"));       //setting the cause of the execption
            throw nfe;                                                     //throwing an exception with cause
        } 
        catch (NumberFormatException nfe) {
            System.out.println(nfe);                   //displaying exception
            System.out.println(nfe.getCause());        //getting the actual cause of exception
        }
    }
}
