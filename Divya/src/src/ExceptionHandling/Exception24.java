package ExceptionHandling;
import java.util.Scanner;
public class Exception24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the values of n1 and n2");
        int n1, n2, n3;
        n1 = s.nextInt();
        n2 = s.nextInt();
        int a[] = new int[5];
        try {
            n3 = n1 / n2;
            System.out.println(n3);
            try {
                a[4] = 8;
                System.out.println(a[4]);
            } catch (ArrayIndexOutOfBoundsException aie) {
                System.out.println("array out of bounds");}
                try {
                    String s1 = null;
                    System.out.println(s1.length());
                } catch (NullPointerException ne) {
                    System.out.println("null pointer exception occured:");
                }
                try {
                    String s2 = "divya";
                    System.out.println(Integer.parseInt(s2));
                } catch (NumberFormatException ne) {
                    System.out.println("number format exception");
                } catch (ArithmeticException ae) {
                    System.out.println("Arithmetic exception occured");
                }
            } finally {
                System.out.println("out of try and catch blocks");
            }
        }
    }