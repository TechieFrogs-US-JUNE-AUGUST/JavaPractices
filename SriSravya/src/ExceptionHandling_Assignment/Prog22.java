//TO ILLUSTRATE MULTIPLE TRY AND CATCH BLOCKS
package ExceptionHandling_Assignment;

public class Prog22 {
    public static void main(String[] args) {
        int a;
        String s;
        int array[]= new int [5];
    try{
          array[6]= 20;                                 //ArrayIndexOutOfBounds Exception is caused
          System.out.println(array[6]);                                  
        }
     catch(ArrayIndexOutOfBoundsException aie){             //and the exception is handled here
        // System.out.println("In Array Index Out of Bound Exception");
          array[3]= 20;
          System.out.println(array[3]);
          try {
            a= 10/0;                                            //Arthimetic exception is caused
        } catch (ArithmeticException ae) {                                    //Arthimetic excpetion is handled
          //System.out.println("Division is Not Possible in Nested Catch block");
          a=10/2;
          System.out.println(a);
        } 
        try {
            s= null;                                            
            System.out.println(s.length());                   //Nullpointer exception is caused
        } catch (NullPointerException ne) {                   //Nullpointer exception is handled here
          // System.out.println("NullPointer exception is handled here");
           s="Sri Sravya";                                
           System.out.println(s);
        } 
      }

    }
}
