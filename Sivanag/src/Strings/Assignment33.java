//Determine whether a given string is palindrome
package Strings;

import java.util.Scanner;

public class Assignment33 {
    static Boolean isPalindrom(String string)
    {
        String temp="";
        char ch[]=new char[string.length()];
        int k=0;
        for(int i=string.length()-1;i>=0;i--)
        {
            ch[k]=string.charAt(i);
            k++;
        }
        temp=String.valueOf(ch);
        // System.out.println(temp);
        // System.out.println(string);
        if(temp.equals(string))
        {
            return true;
        }
        else
        return false;
    }
    public static void main(String[] args) {
        //String string="sasasasfg";
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string=scannerObj.nextLine();
       
        if(Assignment33.isPalindrom(string))
        {
            System.out.println("Given String is a Palindrome");
        }
        else
        System.out.println("Given String is not a Palindrome");
        scannerObj.close();
    }

    
}
