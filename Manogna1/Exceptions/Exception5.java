package Exceptions;

public class Exception5 {
    public static void main(String[] args) {
        try{
            throw new Exception("by passing arguments while throwing Exception"); //while throwing
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
