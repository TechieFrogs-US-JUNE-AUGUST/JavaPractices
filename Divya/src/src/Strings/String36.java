import java.util.Scanner;
public class String36 {
        public static void main(String args[])
        {
            String str, reverse ="";
            Scanner in = new Scanner(System.in);           //scanner object
            System.out.println("Enter a string to reverse");
            str = in.nextLine();
            int length = str.length();                // to find the length of the string
            for (int i = length - 1 ; i >= 0 ; i--)
                reverse = reverse + str.charAt(i);       //  to find reverse of a string

            System.out.println("Reverse of the string: " + reverse);
        }
    }
