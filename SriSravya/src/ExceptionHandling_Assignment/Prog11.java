//HANDLE MULTIPLE EXCEPTIONS (ARRAY OUT OF BOUND)
package ExceptionHandling_Assignment;

public class Prog11 {
    public static void main(String[] args) {
        int a=10, b=2, c=0;
        int array[]= {10,20,30};
        try {
            c= a/b;                                    
            System.out.println("The result is: " +c);

           // array[3]= 40;
            for(int i=3; i>=0; i--){                        // ArrayIndexOutOfBounds Exception is caused here, becaue the i/p array length is 2--0th,1st,2nd positions
                System.out.println("The value of array is: " +array[i]);
           }
        }
        catch(ArrayIndexOutOfBoundsException aie) {           //It is handled here   
            System.out.println("In Array Index Out of Bound Exception" +aie);
        }
        catch (ArithmeticException ae) {             
            System.out.println("This can't be divided by Zero " +ae);
        }
    }
}
