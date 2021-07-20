import java.util.Arrays;
import java.util.Scanner;
public class Astring25{
  public static void main(String[] args){
      Scanner scannerObj = new Scanner(System.in);
      System.out.print("Enter first String: "); //taking inputs from user
      String str1 = scannerObj.nextLine();
      System.out.print("Enter second String: ");
      String str2 = scannerObj.nextLine();
      if(str1.length() == str2.length()){ // calculating length of string and checking both are equal
        char[] charArray1 = str1.toCharArray();// convert strings to char array
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);// sorting an array in an ascending order
        Arrays.sort(charArray2);
        boolean result = Arrays.equals(charArray1, charArray2);//if sorted string are same, 
        if(result)                                             //strings are an anagram 
            System.out.println(str1 + " and " + str2 + " are anagram.");
        else
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
      else
      System.out.println(str1 + " and " + str2 + " are not anagram.");
      scannerObj.close();
  }
} 
