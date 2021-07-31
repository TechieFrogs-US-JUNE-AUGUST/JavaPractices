//TO HANDLE EXCEPTION USING THROWS KEYWORD
package ExceptionHandling_Assignment;

/* class Example{
    static void check() throws ArithmeticException{         //using throws
        System.out.println("In check");
        throw new ArithmeticException("This is example using Throws keyword");             //using throw
    }
    public static void main(String[] args) {
        try {
            check();                                   //calling method
        } catch (ArithmeticException e) {              //handled here
           System.out.println("caught" +e);
        }
    }
}            */

//ANOTHER EXAMPLE

 class InvalidAgeException extends Exception{     //it must extend main class
   InvalidAgeException(){}                       //constructor
   InvalidAgeException(String message){          //constructor with single argument
       super(message);
   } 
}
public class Prog4 {
    public static void main(String[] args) {
        int age= 15;
        try {                                    
            validate(age);                                  //calls method validate() with i/p as parameter
        }
        catch(InvalidAgeException e) {
            System.out.println("Custom Invalid Age exception details:" +e.getMessage());
        }
    }
static void validate(int age) throws InvalidAgeException{     //using throws
        if(age < 18){                                         //logic
            throw new InvalidAgeException("Not valid");      //using throw
        }
        else 
        System.out.println("Right to vote");
    }
}             