package Strings_Assignment;

public class Prog13 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
       sb.append("My ");                           //adding string to stringbuffer
       sb.append("name is ");
       sb.append("Sri Sravya");
       System.out.println("StringBuffer is: " +sb);

       sb.setLength(0);                                        //prints upto the 0th index                
       System.out.println("Updated StringBuffer is: " +sb);
    }
}
