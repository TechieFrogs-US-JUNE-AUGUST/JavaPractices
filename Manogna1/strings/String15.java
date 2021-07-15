package strings;

import java.util.Scanner;

public class String15 {
    public static void main(String[] args) 
    {   
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.next();
        String firstLetter= str.substring(0,1); //contains First letter of the string
        System.out.println("First Letter :" +firstLetter);
        String remainingLetters=str.substring(1,str.length()); //contains Remaining letters of the string
        firstLetter=firstLetter.toUpperCase(); // Capitalize the First letter
        System.out.println("Frst Letter " +firstLetter);
        str=firstLetter+remainingLetters; // add the two substrings
        System.out.println("String : " +str); // Print the String
        sc.close();
    
    }
}
