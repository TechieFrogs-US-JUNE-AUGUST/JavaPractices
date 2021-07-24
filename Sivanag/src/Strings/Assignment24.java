package Strings;

import java.util.Scanner;

public class Assignment24 {
    static Boolean isAlphabet(char c)
    {
        if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z'))
        return true;
        return false;
    }
   
    public static void main(String[] args) {
        Scanner scannerObj =new Scanner(System.in);
        System.out.print("Enter string : ");
        //String string="AFDSAFSD343";
        String string = scannerObj.nextLine();
        char ch[] = string.toCharArray();
        int vowels=0,cons=0;
        for (char c : ch) {
            if(isAlphabet(c))
            {
                switch(c)
                {
                    case 'a','e','i','o','u','A','E','I','O','U' : vowels++;break;
                    default: cons++;break;
                }

            }
           
        }
        System.out.println("Total Number of Vowels in a "+ string + " is " + vowels);
        System.out.println("Total Number of Consonants in a "+ string + " is " + cons);
        scannerObj.close();

    }
    
}
