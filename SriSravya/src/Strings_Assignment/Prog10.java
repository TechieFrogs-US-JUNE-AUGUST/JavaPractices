package Strings_Assignment;
import java.util.Random;

public class Prog10 {
    public static void main(String[] args) {
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";         //string with all characters
        StringBuilder sb=new StringBuilder();          //random StringBuilder
        Random obj=new Random();                       //obj of random class

        int length=7;                                //specifying length
        for(int i=0; i<length; i++){
            int index= obj.nextInt(s.length());      //generating random index num
            char randomChar= s.charAt(index);        //get character specified by index from the string
            sb.append(randomChar);                  //appending char to stringbuilder
        }
        String randomString = sb.toString();
        System.out.println("Random String is: " +randomString);         // o/p will be different each time
    }
}