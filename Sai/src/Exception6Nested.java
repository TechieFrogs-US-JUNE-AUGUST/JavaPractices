import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception6Nested {
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
            //scannerObj.close();
        } catch (InputMismatchException ie) {
            System.out.println("From outer try-catch, catch block");
            try{
                Scanner scannerObj1 = new Scanner(System.in);// creating an object again for getting an i/p
                int z = scannerObj1.nextInt();               //   from the user
                a = scannerObj1.nextInt();
                b = scannerObj1.nextInt();
                System.out.println("Reading the value of z : "+ z);
                scannerObj1.close();
            }catch(InputMismatchException e){
                System.out.println("from nested catch");
            } finally{
                scannerObj.close();
            }
           
            //int c =10;
            //int d = 0;
            //int e = 1;
            /*try {
                a = scannerObj.nextInt();
                int division = c/e;
                System.out.println("From nested try-catch , this is try block");
                System.out.println("Division : "+division);
                int division2 = c/d;//arithmetic exception "/0", goes to 24 th line
                System.out.println(division2);
            } catch (ArithmeticException ae) {
                int division = 10/10;
                System.out.println("From Nested try-catch, catch block");
                System.out.println("division : "+division);
            }*/
        }
        
        System.out.println("ending");
    }
}
