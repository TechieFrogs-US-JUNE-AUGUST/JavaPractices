package ExceptionHandling;

public class ExceptionUsingThrowKeyword3 {
    public static void main(String[] args) {
        try {
            testThrow();
        } catch(Exception e) {
            System.out.println("Catching throw in main function");
        }
    }

    static void testThrow(){
        try{
            throw new NullPointerException("Throwing from static method of the class");
        }catch(NullPointerException e) {
            System.out.println("Null pointer exception caught in static method");
            e.printStackTrace();
            throw e;
        }
    }
}
