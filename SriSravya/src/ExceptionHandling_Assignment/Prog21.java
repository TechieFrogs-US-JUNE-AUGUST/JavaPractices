//TO HANDLE EXCEPTION USING TRY AND MULTIPLE CATCH BLOCKS
package ExceptionHandling_Assignment;

public class Prog21 {
    public static void main(String[] args) {
        int array[]= new int[5];                                //initialisation
        try {
            array[5]= 20/0;                                     //if i/p is wrong any one of the excpetion is caused
        }
        catch(ArithmeticException ae){                           //handling Arthimetic Exception
         //   System.out.println("Arthimetic exception occurs");
            array[4]= 20/10;
            System.out.println(array[4]);
        } 
        catch(ArrayIndexOutOfBoundsException aie){                //handling ArrayIndexOutOfBounds Exception
         //   System.out.println("Array Index outofBound exception occurs");
            array[4]= 40;
            System.out.println(array[4]);   
        }
        catch (Exception e) {                                //if we don't know the exception we can give parent exception and it is handled here
          System.out.println("Parent exception occurs");  
        } 
        System.out.println("Rest of the code");
    }  
}
