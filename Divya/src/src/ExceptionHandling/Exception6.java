package ExceptionHandling;
import java.util.Scanner;
public class Exception6 {
    public static void main(String args[]) {
        int a, b, c;
        Scanner s = new Scanner(System.in);            //scanner by taking inputs from the user
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("please enter the values:");
        try {                                             //nested try
            try {
                c = a / b;             // if b value entered zero then we will get arithmeticException
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a1[] = new int[5];
                a1[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {     //when length of an array exceeds the given length
                System.out.println(e);                             // we will get arrayOutOfBound exception
            }
        } catch (Exception e) {               // it can handle all types of exceptions
            System.out.println("super exception");
        }finally{
            s.close();
        }
    }
    }