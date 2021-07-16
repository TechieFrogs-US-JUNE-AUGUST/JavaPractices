package Strings_Assignment;
import java.util.Scanner;

public class Prog5 {
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a string");      // o/p will be not equal because the address will be stored in scanner
       String s1=scan.nextLine();
      // String s1="Sri";
      // String s2="Sravya";
       String s2=new String("Sri");
       scan.close();
                                
       if(s1==s2)                       //along with string value it checks obj ref too i.e address whether in heap or const pool
       System.out.println("Equal");
       else
       System.out.println("Not Equal");
   } 
}
