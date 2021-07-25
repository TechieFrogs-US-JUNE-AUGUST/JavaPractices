//COMPARE STRING USING EQUALS()
package Strings_Assignment;
import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");      // o/p will equal as string value is same, even though the address is stored in scanner 
        String s1=scan.nextLine();
    //  String s1="Sri";
    //  String s2="Sravya";
        String s2=new String("Sri");
        scan.close();

        if(s1.equals(s2))               //it only checks with string value
        System.out.println("Equal");
        else
        System.out.println("Not Equal");
    }
}
