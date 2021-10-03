import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception21 {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give input : ");
        String s = "good";
        try {
            int num = scannerObj.nextInt();
            System.out.println(num);
        } catch (InputMismatchException ie) {
           System.out.println("From catch block");
           int index = s.indexOf(s);
           System.out.println("index : " + index);           
           ie.printStackTrace();
        } catch(ArithmeticException ae){
            int n = s.length()/0;
            System.out.println(n);

        }
        scannerObj.close();
    }
}
