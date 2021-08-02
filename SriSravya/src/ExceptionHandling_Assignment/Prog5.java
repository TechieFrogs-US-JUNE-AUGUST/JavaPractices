//TO PASS ARGUMENTS WHILE THROWING CHECKED EXCEPTIONS
package ExceptionHandling_Assignment;

public class Prog5 {
    public static void main(String[] args) {
        try {
            throw new Exception("Passing arguments while throwing exception");            //passing arguments while throwing
        } 
        catch (Exception e) {                                    //handling the exception
          System.out.println(e.getMessage());  
        }
    }
}
