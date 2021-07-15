package Strings;

import java.util.Scanner;

public class Asssignment8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s= sc.nextLine();
        //String s = "122356sss";
    int num=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                num++;
            }
       
        }
        if(num==s.length())
        System.out.println("Given String is Numeric");
        else
        System.out.println("Given String is Non Numeric");
        sc.close();
        
    }
   
}
