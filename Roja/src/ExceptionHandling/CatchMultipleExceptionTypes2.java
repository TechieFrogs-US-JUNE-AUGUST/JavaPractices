package ExceptionHandling;

public class CatchMultipleExceptionTypes2 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch(ArithmeticException ae) {
            ae.printStackTrace();
        }
        System.out.println("After first exception");
        try{
            int a = 2/0;
            int b = 1;
            int c = 2;
            System.out.println(a+b+c);
        }catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("printing finally statements");
        }
    }
}
