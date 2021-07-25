//Separate the Indiviual Character from string
package Strings;

import java.util.Scanner;

public class Assignment43 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter String : ");
        String string1=scannerObj.nextLine();
        System.out.println(string1);
       // char ch[]=new char[string1.length()];
        for(int i=0;i<string1.length();i++)
        {
            System.out.print(string1.charAt(i) + " ");
        }
        scannerObj.close();
    }
}
