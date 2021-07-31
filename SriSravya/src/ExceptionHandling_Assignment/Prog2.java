//TO CATCH MULTIPLE EXCEPTION TYPES
package ExceptionHandling_Assignment;

public class Prog2 {
    public static void main(String[] args) {
        try{
            int array[]= new int[5];
            array[5]= 10/0;                                //here we will get Arthimetic Exception
        }                                                  //if we give i/p value 10/2 then we get ArrayIndexOutOfBounds exception

        catch(ArithmeticException ae){                       //those exceptions are handled here
            System.out.println("In Arthimetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("In Array Index Out of Bound Exception");
        }
       // catch(Exception e){
          //  System.out.println(e.getMessage());
      //  }
    }
}
