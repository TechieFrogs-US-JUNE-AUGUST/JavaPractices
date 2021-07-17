package STRINGS;

import java.nio.charset.CharacterCodingException;

public class Stringcountvowelconsdigispace 
{
    public static void main(String[]args)
    {
        String sentence = " 45 Methods Support by String class"; //creating a string sentence

         int vowels = 0 , consonant = 0, digits= 0, spaces = 0;//declare variable vowels
         
         for( int i =0; i<sentence.length();i++)
         {
           char ch =sentence.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u')
            {
                vowels++;
            }
            else if(ch >= 'a' && ch <= 'z'|| ch >= 'A' && ch <= 'Z')
            {
                 consonant++;  
            }
            else if(ch >= '0' && ch <= '9')
            {
             digits ++;
            }
            else if(ch == "")
            {
                spaces++;
            }
         }
            System.out.println("Number of vowels in the sentence is" +vowels);
            System.out.println(" NumberConsonants in the sentence is" + consonant);
            System.out.println("Number of digits in the sentence is " + digits);
            System.out.println("Number of spaces in the sentence is " + spaces);

    }
}
