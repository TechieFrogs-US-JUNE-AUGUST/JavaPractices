//TO HANDLE THE EXCEPTION WITH OVERLOADED METHODS
package ExceptionHandling_Assignment;

public class Prog8 {
    static double method(int i) throws Exception{
        return i/0;
    }
    static double method(int x, double y) throws Exception{
        return x+y;
    }
    static double method(double x, double y){
        return x+y-3;
    }
    public static void main(String[] args) {
        try {
            System.out.println(method(10, 20.0));             //calling method by passing arguments
            System.out.println(method(10.0, 20));            //impiicit type casting performs here and converts int to double
            System.out.println(method(10.0, 20.0)); 
            System.out.println(method(10));               //throws exception 
        } catch (Exception ex) {                                       //exception is handled here
            System.out.println("Exception occurs " +ex);
        }
    }
}
