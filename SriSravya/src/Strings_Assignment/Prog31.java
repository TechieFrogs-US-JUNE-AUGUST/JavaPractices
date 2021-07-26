//TO REPLACE LOWER-CASE CHAR WITH UPPER-CASE AND VICE-VERSA
package Strings_Assignment;

public class Prog31 {
    public static void main(String[] args) {
        String s="sri sravya";
        StringBuffer str=new StringBuffer(s);                     

        for(int i=0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){                     //checking if the letter is lowercase
                str.setCharAt(i, Character.toUpperCase(s.charAt(i)));   //setting the char to uppercase using toUppercase()
            }
            else if(Character.isUpperCase(s.charAt(i))){                 //checking if the letter is uppercase
                str.setCharAt(i, Character.toLowerCase(s.charAt(i)));   //setting the char to uppercase using toLowercase()
            }
        }
        System.out.println("After case conersion: " +str);
    }
}
