package strings;

import java.util.Scanner;

public class String23 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str= sc.nextLine();
        int count=0; //Stores the count of Puntuation Marks
        for(int i=0;i<str.length();i++)
        {
                //Check whether the given Character is a puntuation or not
        if((str.charAt(i)=='!') || (str.charAt(i)==',') || (str.charAt(i)=='.')|| (str.charAt(i)==';') || (str.charAt(i)=='?')||
        (str.charAt(i)=='\'') || (str.charAt(i)=='\"') ||(str.charAt(i)==':') || (str.charAt(i)=='-') )
            count++; 
           
        }
        System.out.println(" Enter number of Punctuation Marks in a String : " +count);
        sc.close();
    }
    
}
