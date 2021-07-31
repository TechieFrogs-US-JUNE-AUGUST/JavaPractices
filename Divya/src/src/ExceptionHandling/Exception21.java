package ExceptionHandling;
import java.util.Scanner;
public class Exception21 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the values of n1 and n2");
        int n1,n2,n3;
        n1=s.nextInt();
        n2=s.nextInt();
       int a[]=new int[5];
            try {
                n3 = n1 / n2;
                System.out.println(n3);
                a[4] = 8;
                System.out.println(a[4]);
                String s1 = null;
                System.out.println(s1.length());
                String s2 = "divya";
                System.out.println(Integer.parseInt(s1));
            } catch (ArithmeticException ae) {
                System.out.println("Arithmetic exception occured");
            } catch (ArrayIndexOutOfBoundsException aie) {
                System.out.println("array out of bounds");
            } catch (NullPointerException ne) {
                System.out.println("null pointer exception occured:");
            } catch (NumberFormatException ne) {
                System.out.println("null pointer exception occured");
            }
        finally{
            System.out.println("out of try and catch blocks");
        }
    }
}