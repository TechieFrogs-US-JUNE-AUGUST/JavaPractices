package ExceptionHandling;

public class Exception12 {
    public static void main(String[] args){
        try
            {
                Class.forName("divya"); // we can load a class at runtime using class.forName() method
            }
            catch (ClassNotFoundException ex)
            {
                System.out.println("entered class is not found");
            }
        }
    }