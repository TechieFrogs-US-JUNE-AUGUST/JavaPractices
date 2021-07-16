package Strings;
import java.util.Scanner;
public class String33 {
    public static void main(String args[])
    {
        String a, b = "";                           //initialising string variables a and b
        Scanner s = new Scanner(System.in);               // scanner object
        System.out.print("Enter the string :");
        a = s.nextLine();                          //scanner method for user input values
        int n = a.length();                             // to find the length of the string
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);         // assigned b value with empty string
        }
        if(a.equalsIgnoreCase(b))           // if string a is equal to b print palindrome
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}
