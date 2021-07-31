package ExceptionHandling;

public class IntegerSumException1 {   
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 20;
            System.out.println(a+b);
            String s = null;
            System.out.println(s.length());
        
        } catch(NullPointerException ne) {
            System.out.println("Handled null pointer exception");
        } catch(Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }    
}
