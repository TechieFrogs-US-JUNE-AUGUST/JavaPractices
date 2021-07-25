//CHECK IF TWO STRINGS ARE ANAGRAAM
package Strings_Assignment;

import java.util.Arrays;

public class Prog9and25 {
    public static void main(String[] args) {
        String s1= "Race";
        String s2= "Care";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()==s2.length()){
            char charArray1[]= s1.toCharArray();           //converting the string to char array using toCharArray
            char charArray2[]= s2.toCharArray();

            Arrays.sort(charArray1);                     //sorting the char array
            Arrays.sort(charArray2);
            boolean result= Arrays.equals(charArray1, charArray2);     //if sorted char arrays are same then string is anagram
            if(result){
                System.out.println(s1+ "  and  " +s2 +" are anagram");
            }
            else{
                System.out.println(s1+ "  and  " +s2 +" are not anagram");
            }
          }
        else{
            System.out.println("Given strings are not anagram");
        }
    }
}
