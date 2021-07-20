package Strings_Assignment;
import java.util.Random;

public class Prog11 {
    public static void main(String[] args) {
        String upperLetter= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetter= "abcdefghijklmnopqrstuvwxyz";
        String number= "0123456789";

        String alphaNumeric= upperLetter+lowerLetter+number;   //combining all the strings
        StringBuilder sb= new StringBuilder();
        Random obj= new Random();

        int length=10;
        for(int i=0; i<length; i++){
            int index= obj.nextInt(alphaNumeric.length());   //generating random index number
            char randomChar= alphaNumeric.charAt(index);     //get character specified by index from the string
            sb.append(randomChar);                          //appending char to stringbuilder
        }
        String randomString = sb.toString();
        System.out.println("Random String is: " +randomString);         // o/p will be different each time
    }
}
