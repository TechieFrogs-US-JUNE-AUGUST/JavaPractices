import java.util.Scanner;
class customException1 extends Exception {
    customException1(String s) {
        super(s);
    }
}
    public class Exception4 {
        public static void main(String[] args) {
            try {
                thrMet();                               //called method
            } catch (customException1 ae) {
                System.out.println("cannot divided by zero");
            }
        }
            static void thrMet ()throws customException1 {
            int n1,n2;                                //throws an exception when method does not have try and catch
            System.out.println("enter the values");
                Scanner s=new Scanner(System.in);
                n1=s.nextInt();
                n2=s.nextInt();
                int n3=n1/n2;
                System.out.println(n3);
               //     throw new ArithmeticException("cannot divided by zero");
        }
        }