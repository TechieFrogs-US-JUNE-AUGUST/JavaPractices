//TO HANDLE CHECKED EXCEPTIONS
package ExceptionHandling_Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Prog9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream Prog9 = null;
        try {
            Prog9 = new FileInputStream("Users/kandi/Prog9.txt");
        } 
        catch (FileNotFoundException fe) {
             System.out.println("File does not exist");   
        }
    }
}
