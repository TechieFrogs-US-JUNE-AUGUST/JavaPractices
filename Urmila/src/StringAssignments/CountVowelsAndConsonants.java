package StringAssignments;

public class CountVowelsAndConsonants 
{
    public static void main(String[] args)
    {
        String sentence = " 45 Methods Support by String class"; //creating a string sentence

        int vowels = 0 , consonant = 0;//declare variable vowels and consonants
        
        for( int i =0; i<sentence.length();i++)
       {
          char ch =sentence.charAt(i);
           if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u')//checking for vowels
           {
               vowels++;
           }
           else if(ch >= 'a' && ch <= 'z'|| ch >= 'A' && ch <= 'Z')//checking for consonants
           {
                consonant++;  
       }
   }
           System.out.println("Number of vowels in the sentence is" +vowels);
           System.out.println(" NumberConsonants in the sentence is" + consonant); 
    }    
}
