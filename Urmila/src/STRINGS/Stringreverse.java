package strings;
import java.util.Scanner;
public class Stringreverse 
{
    public static void main(String[]args)
    {
     Scanner in = new Scanner(System.in);
     String str, reverse ="";
        System.out.println("Enter a string to reverse");
        str = in.nextLine();
        int length = str.length();                // to find the length of the string
        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + str.charAt(i);       //  to find reverse of a string
             System.out.println("Reverse of the string: " + reverse);
    }
    
}
