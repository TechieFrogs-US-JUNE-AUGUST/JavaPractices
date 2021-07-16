package strings;

import java.util.Scanner;

public class String24 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=sc.next();
        int vowels=0,Consonants=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {       //checks whether the given char is vowel or not
            if((str.charAt(i)=='a')||(str.charAt(i)=='e') || (str.charAt(i)=='i') || (str.charAt(i)=='o') || (str.charAt(i)=='u'))
            {
                vowels++; // if vowel vowel++
            }
            else if((str.charAt(i)>='a')&& (str.charAt(i)<='z')) // checks whether the given char is Consonant
            {
                Consonants++;   // if Consonant Consonant++
            }
            
        }
        System.out.println("Number of vowels : " +vowels);
            System.out.println("Number of Consonants : " +Consonants);
            sc.close();

    }
    
}
