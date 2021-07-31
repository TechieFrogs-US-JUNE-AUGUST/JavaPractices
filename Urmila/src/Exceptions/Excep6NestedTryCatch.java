package Exceptions;

public class Excep6NestedTryCatch 
{
    public static void main(String[] args)
    { 
        try{  
            int a[]=new int[5];  
            a[5]=4;  
            }catch(ArrayIndexOutOfBoundsException ie)
            {
                ie.printStackTrace();
            }   
            System.out.println(" statement1");  
             
        
    }
    
}
