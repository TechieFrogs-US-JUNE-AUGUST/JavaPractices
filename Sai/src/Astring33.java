import java.util.Scanner;

public class Astring33{
    public static void main(String[] args){
        String inputString = "SAS";
        StringBuffer inputBuffer = new StringBuffer(inputString);
        inputBuffer.reverse();
        String reverseString = inputBuffer.toString();
        if(inputString.equals(reverseString))
            System.out.println(inputString + " is a Palindrome String");
        else
            System.out.println(inputString + " is not a Palindrome String");
    }
}