package Assignment;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=scannerObj.nextLine();
        String str1=str+" ";
        String word="",revwrd="";
        char ch;
        scannerObj.close();
        System.out.println("Palindrome words are :");
        for(int i=0;i<str1.length();i++)
        {
            ch=str1.charAt(i);
            if(ch==' ')
            {
                if(revwrd.equalsIgnoreCase(word)==true)
                {
                    System.out.println(word);
                }
                
                word="";
                revwrd="";
            }
            else
            {
                word=word+ch;
                revwrd=ch+revwrd;
            }
        }

    }
    
}
