package Exceptions;

public class Exception3 {
    public static void ValidateAge(int age){
    if(age<18)
    {
        ArithmeticException ae=new ArithmeticException("Age not Valid");
        throw ae;
    }
    else{
        System.out.println("right to vote");
    }
} 
   
    public static void main(String[] args) {
        ValidateAge(17);
        
    }
    
}
