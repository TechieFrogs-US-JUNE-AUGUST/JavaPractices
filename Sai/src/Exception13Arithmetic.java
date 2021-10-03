import java.util.Scanner;
public class Exception13Arithmetic {
    public static void main(String[] args) {
        int a,b;
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give a and b values");
        try {
            a = scannerObj.nextInt();// if we are not giving an integer value it goes to catch
            b = scannerObj.nextInt();// if we give b = 0(zero), we get arithmetic exception 
            int division = a/b;
            System.out.println("Fron try block");
            System.out.println(division);
            scannerObj.close();
        }catch(ArithmeticException ae){
            System.out.println("From catch block");
            ae.printStackTrace();
        }
        System.out.println("outside of try - catch");
    }
}
