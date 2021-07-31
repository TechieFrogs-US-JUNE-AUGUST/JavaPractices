package Exceptions;

public class Excep3ClassNotFound 
{
    public static void main(String[] args)
    {
        try 
        {
            Class.forName("java");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        System.out.println("Java");
    }
}
