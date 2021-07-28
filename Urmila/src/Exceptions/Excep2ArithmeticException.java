package Exceptions;

public class Excep2ArithmeticException 
{
    public static  void main(String[] args)
    {
        try{   
            int b =12/0;  
           }
           catch(ArithmeticException ae)
           {
               ae.printStackTrace();
           }
           System.out.println('b');
           try
           {
               int a =1;
               int c = 2;
               int d =( a+c);
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
           System.out.println("print "+ 'd');
        
    }
    
}
