import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception11ArrayIndex {
    public static void main(String[] args){
    Scanner scannerObj = new Scanner(System.in);
        System.out.println(" How many rows you want : ");
        //int row = scannerObj.nextInt();
        try {
            int row = scannerObj.nextInt();
        //if we give any appropriate input instead of an integer it will give InputMismatchException
            int array[] = new int[row];
            array[9] = 100; // if we give less index value it gives arrayindexoutofbound exception
            scannerObj.close();
        } catch (InputMismatchException ie) {
            System.out.println("From an Input MisMatch Exception");
            ie.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("From an ArrayIndexOutOfBoundsException");
            aie.printStackTrace();
        }
        System.out.println(("from Outside the try- catch"));
      }
}
