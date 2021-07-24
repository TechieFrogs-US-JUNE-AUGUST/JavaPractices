//Count the Total number of characters in a string
package Strings;
import java.util.Scanner;
public class Assignment22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println("Total number of characters in String is :" + s.length());     //length of String is Equal to number of characters in a string
        sc.close();

    }
    
    
}
