package strings;

import java.util.Arrays;
import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);//Create object from Scanner class
        System.out.println("Enter First String :");//Take input from user
        String str1=scannerObj.nextLine();
        System.out.println("Enter Second String :");
        String str2=scannerObj.nextLine();
        if(str1.length()==str2.length())//checks whether both the lengths are equal or not
        {
            char charArray1[]=str1.toCharArray();//Converts str1 to char array
            char charArray2[]=str2.toCharArray();//converts str2 to char array
            Arrays.sort(charArray1); //sort the char arrays
            Arrays.sort(charArray2);
            boolean result=Arrays.equals(charArray1,charArray2);//checks whether both the chararrays are same
            if(result)//true
            {
                System.out.println(str1 + " and " +  str2  + " are anagram.");
            }
            else//False
            {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }

        }
        else // if both the lengths are not equal
        {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
        scannerObj.close();
    }    
}
