//TO HANDLE NEGATIVEARRAYSIZE EXCEPTION
package ExceptionHandling_Assignment;

public class Prog15 {
    public static void main(String[] args) {
        int arrSize= -8;                                    //declaring array size as negative
        try {
            int array[]= new int[arrSize];                 //initialising an array
        } 
        catch (NegativeArraySizeException nae) {            //NegativeArraySizeException is handled here
            System.out.println("We cannot create array of negative size");
        }
    }
}
