package Strings;

import java.util.Scanner;

public class Assignment1
{
    Boolean IsAlphabet(char ch)
    {

        
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
           return true;
        else
           return false;
    }


    
    public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the Sentence: ");
                    String s=sc.nextLine();
                     //String s= "This is sivanag 1223588";
                     System.out.println(s.length());
                     //System.out.println(s.charAt(2));
                     int num=0;
                     int sp=0;
                     int v=0;
                     int cons=0;
                     Assignment1 obja=new Assignment1();
                     for(int i=0;i<s.length();i++)
                     {
                        if(Character.isDigit(s.charAt(i)))
                        num++;
                        if(Character.isWhitespace(s.charAt(i)))
                        sp++;
                        if(obja.IsAlphabet(s.charAt(i)))
                        {
                        switch(s.charAt(i))
                        {
                            case 'a','e','i','o','u','A','E','I','O','U' : v++;
                                                                            break;
                            default : cons++;
                            break;

                        }
                    }
                        
                     }
                     System.out.println("Total Number of Digits in Given Sentence is : " + num);
                     System.out.println("Total Number of Spaces in Given Sentence is : " + sp);
                     System.out.println("Total Number of Vowels in Given Sentence is : " + v);
                     System.out.println("Total Number of Consonants in Given Sentence is : " + cons);
                     sc.close();
    }

    


}