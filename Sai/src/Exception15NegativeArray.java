import java.util.Scanner;
public class Exception15NegativeArray {
    public static void main(String[] args){
    Scanner scannerObj = new Scanner(System.in);
        System.out.println(" How many rows you want : ");
        try {
            int row = scannerObj.nextInt();
        //if we give negative size for an array , it will give you
            int array[] = new int[row];
            array[9] = 100; // if we give less index value it gives arrayindexoutofbound exception
            scannerObj.close();
        } catch (NegativeArraySizeException ne) {
            System.out.println("From a Negative Array Size Exception Ctch - block");
            ne.printStackTrace();
        } finally{  // the code in this block will executes for sure
            System.out.println("From finally block");
        }
        System.out.println(("from Outside the try- catch"));
      }
}