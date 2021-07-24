package StringsAssignment;

import java.util.Arrays;

public class StringsAssignemt9 {
    public static void main(String[] args) {
        String string1= "there";
        String string2= "three";
        string1=string1.toLowerCase();
        string2=string2.toLowerCase();

        if(string1.length()==string2.length()){
            char charArray1[]= string1.toCharArray();           //converting the string to char array using toCharArray
            char charArray2[]= string2.toCharArray();

            Arrays.sort(charArray1);                     //sorting the char array
            Arrays.sort(charArray2);
            boolean result= Arrays.equals(charArray1, charArray2);     //if sorted char arrays are same then string is anagram
            if(result){
                System.out.println(string1+ "  and  " +string2 +" are anagram");
            }
            else{
                System.out.println(string1+ "  and  " +string2 +" are not anagram");
            }
          }
        else{
            System.out.println("Given strings are not anagram");
        }
    }
}
