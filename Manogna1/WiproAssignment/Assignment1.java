package WiproAssignment;

import java.util.Scanner;


public class Assignment1 {
   public static void main(String[] args) {
       Scanner scannerObj=new Scanner(System.in);
       System.out.println("Input");
       String str=scannerObj.nextLine();
       StringBuffer newstr=new StringBuffer(str);
       for(int i=0;i<str.length();i++)
       {
           if(Character.isLowerCase(str.charAt(i))) //checks for lowercase
           {
               newstr.setCharAt(i, Character.toUpperCase(str.charAt(i))); //converts into uppercase
           }
           if(Character.isUpperCase(str.charAt(i))) //checks for uppercase
           {
               newstr.setCharAt(i, Character.toLowerCase(str.charAt(i))); //converts into lowercase
           }
       }
       System.out.println("Output " +newstr);
       scannerObj.close();
   }
    
}
