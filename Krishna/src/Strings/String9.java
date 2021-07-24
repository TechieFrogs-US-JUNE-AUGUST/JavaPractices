package Strings;

import java.util.Arrays;

public class String9 
{
    public static void main(String[] args) 
    {
        String str1= "Race";
        String str2= "Care";
        str1=str1.toLowerCase();                                        // converts the characters in the string to lower case  
        str2=str2.toLowerCase();                                        // converts the characters in the string to lower case

        if(str1.length()==str2.length())
        {
            char charArray1[]= str1.toCharArray();                      //converting the string to char array using toCharArray
            char charArray2[]= str2.toCharArray();

            Arrays.sort(charArray1);                                    //sorting the char array
            Arrays.sort(charArray2);
            boolean result= Arrays.equals(charArray1, charArray2);     //if sorted char arrays are same then string is anagram
            if(result)
            {
                System.out.println(str1+ " , " +str2 +" are anagram");
            }
            else
            {
                System.out.println(str1+ " , " +str2 +" are not anagram");
            }
        }
        else
        {
            System.out.println( str1+ ", " +str2 + " are not anagram");
        }
    }
}