package Strings;

public class String1 
{
     public static void main(String[] args) 
     {
         String s="hi team678";                                      // string s is created.
         int vowels=0,digits=0,spaces=0,consonants=0;                  // variables are declared to find no digits , vowels,sppaces,consonants.
         for(int i=0;i<s.length();i++)
         {
             char ch=s.charAt(i);                                     // the curser will get char value at index value of i 
             if(ch=='a'|ch=='A'|ch=='e'|ch=='E'| ch=='i'|ch=='I'|ch=='o'|ch=='O'|ch=='u'|ch=='U')
            {
                vowels++;
            }
            else if(ch>='a' && ch<='z')                      // checks if character is between a to z
            {
                consonants++;    
            }
            else if(ch==' ')                                 // checks if there are spaces in the string or not
            {
            spaces++;
            }
            else if(ch>='0' && ch<= '9')                    // checks for values in the string.
            {
                digits++;
            } 
         }
         System.out.println(" digits in the string are :" +digits);
         System.out.println("Spaces in the string are: " +spaces);
         System.out.println("vowels in the string are: " +vowels);
         System.out.println(" consonants in the string are: " +consonants);
     }   
}
