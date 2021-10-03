import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception24 {
    public static void main(String[] args){
        int a, b;
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(" Give a and b values");
        try {
            a = scannerObj.nextInt();// giving integer value , 12 line execute and goes to 30th line
            b = scannerObj.nextInt();// if not Inputmismatch exception, goes to line 14
            System.out.println("From outer try-catch , try block");
            int value = a-b;
            System.out.println(value);
            scannerObj.close();
        } catch (InputMismatchException ie) {
            System.out.println("From outer try-catch, catch block");
            int c =10;
            int d = 0;
            int e = 1;
            try {
                int division = c/e;
                System.out.println("From nested try-catch , this is try block");
                System.out.println("Division : "+division);
                int division2 = c/d;//arithmetic exception "/0", goes to 24 th line
                System.out.println(division2);
            } catch (ArithmeticException ae) {
                int division = 10/10;
                System.out.println("From Nested try-catch, catch block");
                System.out.println("division : "+division);
            }
        }
        System.out.println("ending");
    }
}