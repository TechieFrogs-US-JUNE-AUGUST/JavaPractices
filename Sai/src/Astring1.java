import java.util.Scanner;
public class Astring1{
    static void countValues(String str){
        int vowels = 0, consonant = 0, specialChar = 0, digit = 0;
        int n = str.length(); //gives length of the string
        for (int i = 0; i < n; i++) { //checks entire string
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                ch = Character.toLowerCase(ch);;//Converts all the characters into lower case
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')//checks for vowels
                    vowels++;
                else    // if not it will give consonants value
                    consonant++;
            }
            else if (ch >= '0' && ch <= '9') //if not the alphabets, checks for digits
                digit++;
            else  // not charecters & not digits - checks for special charcters
                specialChar++;
        } 
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonant: " + consonant);
        System.out.println("Digit: " + digit);
        System.out.println("Special Character: " + specialChar);
    }
    static public void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();
        //String str = "Strings Assignment1";
        countValues(str);
    }
}
 