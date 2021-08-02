//HANDLE MULTIPLE EXCEPTIONS (DIVIDE BY ZERO)
package ExceptionHandling_Assignment;

public class Prog10 {
    public static void main(String[] args) {
        int a=10, b=0, c=0;
        int array[]= {10,20,30};
        try {
            c= a/b;                                    //arthimetic excpetion is raised
            System.out.println("The result is: " +c);

            for(int i=2; i>=0; i--){                         //If we give i value more than 2, it cause ArrayIndexOutOfBoundsException here
                System.out.println("The value of array is: " +array[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException aie) {
            System.out.println("In Array Index Out of Bound Exception" +aie);
        }
        catch (ArithmeticException ae) {             //it is handled here
            System.out.println("This can't be divided by Zero " +ae);
        }
    }
}
