package ExceptionHandling;

import java.io.IOException;

public class ExceptionUsingThrowsKeyword4 {
    public static void main(String[] args) {
        try {
            testThrows();
        } catch(Exception e) {
            System.out.println("Exception handled");
        }
        System.out.println("Normal flow");
    }

    static void testThrows() throws IOException{
        throw new IOException("Error");
    }
}
