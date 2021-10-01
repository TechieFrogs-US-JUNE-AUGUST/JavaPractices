import java.util.Scanner;
import java.util.InputMismatchException;
public class Exception23 {
    public static void main(String[] args) {
        int a,b;
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give a and b values");
        try {
            a = scannerObj.nextInt();// if we are not giving an integer value it goes to catch
            b = scannerObj.nextInt();
            int sum = a +b;
            System.out.println("From try block");
            System.out.println(sum);
            scannerObj.close();
            // in below statement if we give Exception directly we no need to import, because Exception
            // is a class. But her we are using only InputMismatchException, so we need to import.
        } catch (InputMismatchException ie) {  // it wont acces if the try block got correct input
            int sum = 1+-1;
            System.out.println("From catch Block");
            System.out.println(sum);
            ie.printStackTrace(); // it gives the output as what exeception is hapenning in the catch
        }finally{ // the code we need to execute for mandatory, we have to give in finally block
            System.out.println("a and b are integer values");
        }
    }
} 
