package Strings;

public class String12 
{
   public static void main(String[] args) 
   {
       StringBuffer strbuff=new StringBuffer("hi teamRK");
       System.out.println("StringBuffer is: " +strbuff);
       System.out.println(strbuff.length());
       System.out.println(strbuff.delete(0, 7));             //deleting the stringbuffer from index 0 to 7 
       System.out.println("Updated StringBuffer is: " +strbuff);
   } 
}