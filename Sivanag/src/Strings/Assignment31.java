// Replace Lower case Character with Uppercase Character and vice versa
package Strings;
import java.util.Scanner;
public class Assignment31 {
    public static void main(String[] args) {
        Scanner scannerobject=new Scanner(System.in);     
        System.out.println("Enter String");
        //String string ="aaDHargJUgH";
        String string=scannerobject.nextLine();
        String temp=string;
        char ch[]=new char[string.length()];
        for(int i=0;i<string.length();i++)
        {
        if(Character.isLowerCase(string.charAt(i)))
        ch[i]=Character.toUpperCase(string.charAt(i));
        if(Character.isUpperCase(string.charAt(i)))
        ch[i]=Character.toLowerCase(string.charAt(i));
        }
        System.out.println(temp + " " + String.valueOf(ch));
        scannerobject.close();
} 
}
