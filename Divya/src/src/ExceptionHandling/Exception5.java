package ExceptionHandling;

public class Exception5 {

    public static void main(String args[]) {
        try {
            throw new Exception("throwing an exception");        // arguemnents passed while throwing an exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}