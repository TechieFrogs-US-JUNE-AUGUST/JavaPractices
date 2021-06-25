import java.util.Scanner;
public class Palindromstring15
 {
    public static void main(String args[])  
   {  
      String s, rev= ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      s= in.nextLine();   
      int length =s.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         rev = rev +s.charAt(i);  
      if (s.equals(rev))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  