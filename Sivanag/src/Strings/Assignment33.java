//Determine whether a given string is palindrome
package Strings;
public class Assignment33 {
    public static void main(String[] args) {
        String string="sasasas";
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
            System.out.println("Given String is a Palindrome");
        }
        else
        System.out.println("Given String is not a Palindrome");
    }


}
