package strings;

import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=scannerObj.nextLine();
        int num=0;
        for(int i=0;i<str.length();i++)
        {
           if(Character.isDigit(str.charAt(i)))//character.isdigit is used to check whether it is numeric or not
           {
               num++;
           }
        }
        if(num==str.length())
        System.out.println("Given String is Numeric");
        else
        System.out.println("Given String is not Numeric");
        scannerObj.close();
    }
    
}
