import java.util.InputMismatchException;
import java.util.Scanner;

//SAMPLE PROGRAM USING THROW

/* public class ExceptionHandling2 {
    static void validate(int age){
        if(age<18){
           // throw new ArithmeticException("Not valid");                 //we can use this syntax also
           ArithmeticException ae=new ArithmeticException("Not valid");   //using throw with using obj ae
           throw ae;
        }else{ 
        System.out.println("Right to vote");
        }
    }
    public static void main(String[] args) {
        validate(15);
        System.out.println("Rest of the code");
    }
}     */

//RETHROWING THE EXCEPTION
/* public class ExceptionHandling2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    try{
           int a= sc.nextInt();
           int b= sc.nextInt();
        if(a>5){
        ArithmeticException ae=new ArithmeticException("Rethrow example");
        throw ae;
        }
    } catch(InputMismatchException ie){
       int a=10;
       int b=0; 
        try {
           int i= a/b; 
        } catch (ArithmeticException ae) {
            int i= 10/2;
            System.out.println(i);
        }
        throw ie;                            //This is called rethrowing an exception
    }
  }
}                             */



//CUSTOM EXCEPTIONS

/* class InvalidAgeException extends Exception{            //to create any custom exceptions we need to extend the exception main class
      InvalidAgeException(){                          //we need to have constructors
       super("Input is not valid");
      }
      InvalidAgeException(String message){           //constructor
          super(message);
      }
}
public class ExceptionHandling2{
    public static void main(String[] args) {
        int age= 15;
        if(age<18){                                                     //if age<18 we are explicitly throwing an exception that is InvalidAgeException
            try {
                InvalidAgeException obj= new InvalidAgeException();      //if we use this instance then default constructor is called and prints their block of code
              //InvalidAgeException obj= new InvalidAgeException("Not valid");   //we can use this syntax also, instance for custom exception using one parameter
                throw obj;
               // throw new InvalidAgeException("Not valid");                  //throwing an custom excpetion
            }
             catch (InvalidAgeException e) {
                System.out.println("Custom exception details:" +e.getMessage());
            }           
        }
        else 
        System.out.println("Right to vote");
    }
}                     */



//THROWING CUSTOM EXCEPTION FROM A METHOD
/* class InvalidAgeException extends Exception{           
    InvalidAgeException(){                           
    }
    InvalidAgeException(String message){          
        super(message);
    }
}
public class ExceptionHandling2{
  public static void main(String[] args) {
      int age= 15;
      validate(age);                                     //calling method
      
  }
  static void validate(int age){                            //method throwing custom exception
    if(age<18){                                                     
        try {
            InvalidAgeException obj= new InvalidAgeException("Not valid");  
            throw obj;             
        }
         catch (InvalidAgeException e) {
            System.out.println("Custom exception details:" +e.getMessage());
        }           
    }
    else 
    System.out.println("Right to vote");
    }
  }                  */



  //USING THROWS KEYWORD
  //when you want to throw custom exception it should be handled either in calling part OR in the called method
  //simply we can remove throws keyword and handle the custom exception in try catch block
 /* class InvalidAgeException extends Exception{             //using custom exceptions we can create checked and unchecked exceptions like IOException, NullException etc     
    InvalidAgeException(){                           
    }
    InvalidAgeException(String message){          
        super(message);
    }
}
  public class ExceptionHandling2{
      public static void main(String[] args) {    //u cannot use 'throws' here in the main method
          try{                                      //if we are writing logic of custom exception in try block no need of using method
              validate(15);
          }
          catch(InvalidAgeException e) {
              System.out.println("Custom exception details:" +e.getMessage());
      }
  }
  static void validate(int age) throws InvalidAgeException{   //if we are using a method to throw custom exception then we need to use 'throws' keyword OR we should handle exception using try catch in method itself
  if(age<18){
      throw new InvalidAgeException("Not valid");
  
   } else
     System.out.println("Right to vote");
   }
}         */


//USING MULTIPLE CUSTOM EXCEPTIONS

/* class InvalidInput extends Exception{
    InvalidInput(){
    }
    InvalidInput(String input){
        super(input);
    }
}
class InvalidAgeException extends Exception{             
    InvalidAgeException(){                            
    }
    InvalidAgeException(String message){          
        super(message);
    }
}
  public class ExceptionHandling2{
      public static void main(String[] args) {   
       // int age=0;                                 //if we give age i/p '0', it will go to custom exception InvalidInput
          int age= 15;                         //if we give age i/p other than '0' and less than 18, it will go custom exception InvalidAgeException
          try{  
              if(age==0){
                  throw new InvalidInput("Wrong input");
              }                                    
              validate(age);
          }
          catch(InvalidAgeException e) {
              System.out.println("Custom exception details:" +e.getMessage());
        }
         catch(InvalidInput ae){
             System.out.println("Multiple custom exception details: " +ae);
         }
  }
  static void validate(int age) throws InvalidAgeException{   
  if(age<18){
      throw new InvalidAgeException("Not valid");
  
   } else
     System.out.println("Right to vote");
   }
}               */


//HANDLING MULTIPLE EXCEPTIONS FROM SAME METHOD

class InvalidInput extends Exception{
    InvalidInput(){
    }
    InvalidInput(String input){
        super(input);
    }
}
class InvalidAgeException extends Exception{             
    InvalidAgeException(){                            
    }
    InvalidAgeException(String message){          
        super(message);
    } 
}
  public class ExceptionHandling2{
      public static void main(String[] args) {   
         int age=0;                                 //if we give age i/p '0', it will go to the method validate() and 'throws' custom exception InvalidInput
       //int age= 15;                         //if we give age i/p other than '0' and less than 18, it will go to the method validate() and 'throws' custom exception InvalidAgeException
          try{                                    
              validate(age);
          }
          catch(InvalidAgeException e) {
              System.out.println("Custom exception details:" +e.getMessage());
        }
         catch(InvalidInput ae){
             System.out.println("Multiple custom exception details: " +ae);
         }
  }
  static void validate(int age) throws InvalidAgeException, InvalidInput{       //throwing multiple custom exceptions
    if(age==0){ 
        throw new InvalidInput("Wrong input");
    }   
    if(age<18){
      throw new InvalidAgeException("Not valid");
   } else
     System.out.println("Right to vote");
   }
}
