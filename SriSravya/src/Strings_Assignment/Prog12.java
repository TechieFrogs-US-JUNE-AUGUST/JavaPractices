package Strings_Assignment;

public class Prog12 {
   public static void main(String[] args) {
     //StringBuffer sb=new StringBuffer();                //stringbuffer with an empty string
       StringBuffer sb=new StringBuffer("My name is Sri Sravya");
     //sb.append("My ");                                 //adding string to stringbuffer
     //sb.append("name is ");
     //sb.append("Sri Sravya");
       System.out.println("StringBuffer is: " +sb);

       System.out.println(sb.delete(0, 22));             //deleting the stringbuffer
       System.out.println("Updated StringBuffer is: " +sb);
   } 
}
