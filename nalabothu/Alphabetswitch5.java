package assignment1;
import java.util.Scanner;
public class Alphabetswitch5 {
    public static void main(String[] args)
{
    String str;
    Scanner sr=new Scanner(System.in);
    System.out.println("enter string value");
    str=sr.next();
    switch(str)
    {
        case "a": System.out.println (str+"is vowel");
        break;
        case "e": System.out.println (str+"is vowel");
        break;
        case "i": System.out.println (str+"is vowel");
        break;
        case "o": System.out.println (str+"is vowel");
        break;
        case "u": System.out.println (str+"is vowel");
        break;
    
    default: System.out.println("not an ovwel");
    }  
}    
}
