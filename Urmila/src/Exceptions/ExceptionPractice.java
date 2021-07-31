package Exceptions;

public class ExceptionPractice 
{
    public static void main(String[] args)
    {
       /* try{
        int i = 10/0; // we get arithematic  
        
        }
        catch(ArithmeticException ae)
        {
            ae.printStackTrace();
        }
        int array[] = new int[5];
        array[6] = 2;
        System.out.println(" my array is:" + array[4]);
        try{
            int array1[] = new int[6];
            array[7]= 6;
        }
        
        catch(IndexOutOfBoundsException ie)
        {
            ie.printStackTrace();
        }
        
        System.out.println("My array is:" + array[7]);*/
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

