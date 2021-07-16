package Strings_Assignment;

public class Prog14 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("My name is Sri Sravya");
        //sb.append("My ");                           //adding string to stringbuffer
       //sb.append("name is ");
       //sb.append("Sri Sravya");
        System.out.println("StringBuffer is: " +sb);

        sb=new StringBuffer();                                   //new obj is created and asigned to sb with no string value in arguments
        System.out.println("Updated StringBuffer is: " +sb);

    }
}
