package ExceptionHandling;

public class Exception20 {
    public static void main(String[] args) {
        try {
            String s1 = "divya";
            int num = Integer.parseInt(s1);
            System.out.println(num);
        } catch (NumberFormatException e) {            //this exception occurred when an attempt is made to convert
            System.out.println("Number format exception occurred");  //a string with improper format in to string
        }
    }
}