import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception14IndexOutofBound {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(" How many rows you want : ");
        //int row = scannerObj.nextInt();
        try {
            int row = scannerObj.nextInt();
        //if ww dont give integer, it will give InputMismatchException and goes to line 15
            int array[] = new int[row];
            array[9] = 100; // if less index it gives arrayindexoutofbound exception, goes to line 18
            scannerObj.close();
        } catch (InputMismatchException ie) {
            System.out.println("From an Input MisMatch Exception");
            ie.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("From an ArrayIndexOutOfBoundsException");
            aie.printStackTrace();
        }
        System.out.println("Bye Bye");
        scannerObj.close();
    }
}
