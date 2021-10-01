import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception2MultipleCatches {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(" How many rows you want : ");
        //int row = scannerObj.nextInt();
        try {
            int row = scannerObj.nextInt();
        //if we give any appropriate input instead of an integer it will give InputMismatchException
            int array[] = new int[row];
            array[9] = 100; // if we give less index value it gives arrayindexoutofbound exception
            array[1] = 1/0;// 1/0 wont take and gives arithmetic exception will occur
            scannerObj.close();
        } catch (InputMismatchException ie) {
            System.out.println("From an Input MisMatch Exception");
            ie.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("From an ArrayIndexOutOfBoundsException");
            aie.printStackTrace();
        } catch(ArithmeticException ae){
            System.out.println("From an Arithmetic Exception");
            ae.printStackTrace();
        }
        System.out.println(("from Outside the try- catch"));
      }
}
