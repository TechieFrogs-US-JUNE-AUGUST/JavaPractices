//TO SWAP TWO STRING VARIABLES USING THIRS OR TEMP VARIABLE
package Strings_Assignment;

public class Prog44 {
   public static void main(String[] args) {
       String s1="Sri";
       String s2="Sravya";
       System.out.println("Before Swap: " +s1+" "+s2);
       s1= s1+s2;
       s2= s1.substring(0, s1.length()-s2.length());
       s1= s1.substring(s2.length());
       System.out.println("After Swap: " +s1+" "+s2);
   } 
}
