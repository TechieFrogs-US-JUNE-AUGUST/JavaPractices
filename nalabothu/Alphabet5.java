package assignment1;
import java.util.Scanner;
public class Alphabet5 {
    public static void main(String[] args)
    {
        char ch;
        Scanner sr =new Scanner(System.in);
        System.out.println("enter character value");
        ch=sr.next().charAt(0);
        System.out.println("given character is"+ch);
if((ch=='a')&&(ch=='e')&&(ch=='i')&&(ch=='o')&&(ch=='u'))
{
    System.out.println("given character is vowel");

}
else
{
    System.out.println("given character is consonant");
}
    }
}
