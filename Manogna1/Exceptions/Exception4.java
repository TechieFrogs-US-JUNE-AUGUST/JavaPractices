package Exceptions;

class InvalidAgeException extends Exception //it must extend main class
{
   // InvalidAgeException() {}
    
   
    InvalidAgeException(String message) //single argument constructor
    {
        super(message);
    }
}

public class Exception4 {

    static void validate(int age) throws InvalidAgeException  //using throws
    {
            if(age<18)
        {
            ArithmeticException ae=new ArithmeticException("Age not Valid"); //using throw
            throw ae;
        }
        else{
            System.out.println("right to vote");
        }
    }

    public static void main(String[] args)
     {
        int age=17;
        try{
            validate(age);
        }catch(InvalidAgeException e)
        
        {
            System.out.println(" Invalid age exception details :" +e.getMessage());
        }

        
    }
}    


