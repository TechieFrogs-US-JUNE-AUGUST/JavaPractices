package Exceptions;

public class Excep4MultipleTryCatch 
{
    public static void main(String[] args)
    {
        try{  
            try{   
               int b =12/0;  
              }catch(ArithmeticException ae)
              {
                  ae.printStackTrace();
              }  
             
              try{  
              int a[]=new int[5];  
              a[5]=4;  
              }catch(ArrayIndexOutOfBoundsException ie)
              {
                  ie.printStackTrace();
              }  
               
              System.out.println(" statement1");  
              }
              catch(Exception e)
              {
                  e.printStackTrace();;
              }  
            
            System.out.println("statement2");  
          
    }
    
}
