import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception10Multiple {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(" How many rows you want : ");
        try {
            int number = scannerObj.nextInt();
        //if we give any appropriate input instead of an integer it will give InputMismatchException
            int array[] = new int[number];
            array[3] = 1/0;// 1/0 wont take and gives arithmetic exception will occur
            scannerObj.close();
        } catch (InputMismatchException ie) {
            System.out.println("From an Input MisMatch Exception");
            ie.printStackTrace();
        } catch(ArithmeticException ae){
            System.out.println("From an Arithmetic Exception");
            ae.printStackTrace();
        }
        System.out.println(("from Outside the try- catch"));
    }
}