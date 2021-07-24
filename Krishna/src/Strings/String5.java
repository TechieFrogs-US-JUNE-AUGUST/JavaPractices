package Strings;

public class String5
 {
    public static void main(String[] args) 
    {
        String str1 = "rama";
        String str2 = "krishna";
        String str3 = "Rama";
        System.out.println(str1 == str2);   // false both strings are not same.
        System.out.println(str1 == str3);   //false both strings are same but case is different
        System.out.println(str2 == str3);   //false both strings are not same.
        //System.out.println(str1 == str1);   //true both strings are same.
    }   
}