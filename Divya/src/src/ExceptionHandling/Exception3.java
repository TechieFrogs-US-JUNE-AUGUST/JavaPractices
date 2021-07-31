package ExceptionHandling;
import java.util.Scanner;
public class Exception3 {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.println(a);
        try {
            if (a > 10) // to explicitly call an exception we will use the throw keyword
               // ArithmeticException ae=new ArithmeticException("my value greater than 10");
                throw new ArithmeticException("my value greater than 10");
             //   throw ae;   another way
        }finally{
            s.close();
        }
    }
}