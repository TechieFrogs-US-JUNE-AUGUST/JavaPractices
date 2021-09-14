//TO HANDLE EXCEPTION USING THROW KEYWORD
package ExceptionHandling_Assignment;

public class Prog3 {

    private static void ValidateAge(int age) {
        if(age <18){
          // throw new ArithmeticException("Age is not valid");                 //using throw keyword
          ArithmeticException ae= new ArithmeticException("Age is not valid");    //we can use this syntax also
          throw ae;
        } else {
           System.out.println("Right to vote");
       }
    }
    public static void main(String[] args) {
        ValidateAge(15);                                //calling method by passing i/p value
        System.out.println("Rest of the code");
    }
}
