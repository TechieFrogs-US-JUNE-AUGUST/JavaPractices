package src.Coding_Assignment;
import java.util.Scanner;
public class Assignment1 {
    void palindrome(String string)
    {
        char[] ch = string.toCharArray();
        char[] ch1=new char[ch.length];
        for(int i=0;i<ch.length;i++)
        {
            ch1[i]=ch[ch.length-1-i];       
        }
        if(string.equals(String.valueOf(ch1)))
        {
            System.out.println(string +" is Palindrome");
        }      
    }
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        Assignment1 obj1=new Assignment1();
        System.out.println("Enter String");
        String string=scannerObj.nextLine();
        String[] string1=string.split(" ");
        for (String string2 : string1) {
            obj1.palindrome(string2);
        }
        scannerObj.close();
    }  
}
