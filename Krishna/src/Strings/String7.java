package Strings;

public class String7 
{
    public static void main(String[] args) 
    {
        String str1 = "rama";
        String str2 =  new String("rama"); 
        String str3 = new String("Rama");   
        String str4 = "rama";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
        System.out.println(str1==str4);     //address is in heap so o/p will be Not Equal even if string values are same
    }
}