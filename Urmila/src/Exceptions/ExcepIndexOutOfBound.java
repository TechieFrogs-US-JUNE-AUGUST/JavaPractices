package Exceptions;

public class ExcepIndexOutOfBound 
{
    public static void main(String[] args)
    {
        try{
            int num[] = {1, 2, 3, 4};
            System.out.println(num[5]);
        }
        catch(IndexOutOfBoundsException ie)
        {
            ie.printStackTrace();
        }
        System.out.println("num[5]");
    }

    
}
