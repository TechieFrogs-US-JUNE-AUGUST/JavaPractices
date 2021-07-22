import java.util.Scanner;

public class Astring43{
    public static void main(String[] args){ 
        Scanner string = new Scanner(System.in);
        System.out.println("Give the string : ");
        String input = string.nextLine();
        System.out.println(
            "Individual characters from the given string: ");
        for (int i = 0; i < input.length(); i++) { //iterate through every character of a string
            System.out.print(input.charAt(i) + " ");//access to print every index location character
        }
        string.close();
    }
}
