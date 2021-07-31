package Exceptions;

public class Assignment2 {
  
  
        public static void main(String[] args) {  
              
               try{
                   int[] a=new int[4];
                   a[5]=100/2;
                  }catch(ArithmeticException ae)
                  {
                      System.out.println("Arthematic Exception");
                  }
                  catch(ArrayIndexOutOfBoundsException e)
                  {
                      System.out.println("Array Out of Bound Exception");
                  }
                  catch(Exception e)
                  {
                    System.out.println("Other Error");
                  }
                  
        }  
    
}
