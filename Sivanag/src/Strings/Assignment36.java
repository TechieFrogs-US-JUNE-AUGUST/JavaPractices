package Strings;

import java.util.Scanner;
//Find Reverse of the string
public class Assignment36 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string =scannerObject.nextLine();
        //String string="sas";
        String temp="";
        char ch[]=new char[string.length()];
        int k=0;
        for(int i=string.length()-1;i>=0;i--)
        {
            ch[k]=string.charAt(i);
            k++;
        }
        temp=String.valueOf(ch);
        System.out.println(string +" Reverse " +temp);
     scannerObject.close();
    }   
}
