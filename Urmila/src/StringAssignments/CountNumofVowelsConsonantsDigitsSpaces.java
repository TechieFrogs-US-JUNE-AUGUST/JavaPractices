package StringAssignments;

public class CountNumofVowelsConsonantsDigitsSpaces
{
    public static void main(String[] args) {
        
    
        String sentence = "This is my new sentence created"; //creating a string sentence(as literal)

         int vowels = 0 , consonant = 0, digits= 0, spaces = 0;//declare variable vowels,consonants,digits&spaces
         
         for( int i =0; i<sentence.length();i++)//loop iterates characters in sentence and display them
         {
           char ch =sentence.charAt(i);//returns the character value at given index number
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u')//checking for vowels
            {
                vowels++;
            }
            else if(ch >= 'a' && ch <= 'z'|| ch >= 'A' && ch <= 'Z')//checking for consonants
            {
                 consonant++;  
            }
            else if(ch >= '0' && ch <= '9') // checking for digits
            {
             digits ++;
            }
            else if(ch == ' ') //checking for Spaces
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
