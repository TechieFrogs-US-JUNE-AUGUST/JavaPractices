package StringAssignments;

import java.util.Scanner;

public class NumofWordsinTheTextFile 
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        System.out.println("Original String: " + input);
        //input = input.replaceAll("\\s", ""); //replacing space with no spaces
        //System.out.println("Final String: " + input.length());// number of letters in a file
        String[] wordList = input.split("\\s+");//string is splitting into tokens(words)
        //int countWord=0;
        //countWord += wordList.length;
        for (int i = 0; i < wordList.length; i++) {//getting every word from wordList array
            System.out.println("Words from the string are : " + wordList[i]);
        }
        System.out.println("Total number of words in a file are : " +wordList.length);
        sc.close();
    }
    
}
