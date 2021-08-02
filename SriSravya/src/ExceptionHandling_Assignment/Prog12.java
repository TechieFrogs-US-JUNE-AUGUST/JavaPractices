//TO HANDLE CLASS NOT FOUND EXCEPTION
package ExceptionHandling_Assignment;

public class Prog12 {
    public static void main(String[] args) {
        try {
            Class.forName("Sri Sravya");                  //exception is caused as ClassNotFoundException
        } catch (ClassNotFoundException ce) {             //it is handled here
            ce.printStackTrace();
        }
    }
}
