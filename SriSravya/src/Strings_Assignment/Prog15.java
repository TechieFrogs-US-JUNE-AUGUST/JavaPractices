//CAPITILISE THE FIRST CHAR OF EACH WORD IN A STRING
package Strings_Assignment;

/* public class Prog15 {
    public static void main(String[] args) {
        String s="sravya";
        String firstLetter= s.substring(0, 1);                   //this substring has first letter of string s
        String remainingLetters= s.substring(1, s.length());   //this substring contains remaining letters
 
        firstLetter= firstLetter.toUpperCase();               //converts to uppercase
        s= firstLetter + remainingLetters;                   //after converting join the 2 substrings
        System.out.println("Name is: " +s);
    }
}           */

public class Prog15{
    public static void main(String[] args) {
        String s= "sri sravya";

        char charArray[]= s.toCharArray();          //storing each char to char array
        boolean foundSpace= true;

        for(int i=0; i<charArray.length; i++){
            if(Character.isLetter(charArray[i])){     //if the array element is a letter
                if(foundSpace){                       //checking if found space before letter
                    charArray[i]= Character.toUpperCase(charArray[i]);       //changing the letter to uppercase
                    foundSpace= false;
                }
            }
            else{                                  //if the new char is not character
                foundSpace= true;
            }
        }
        s= String.valueOf(charArray);              //converting char array to string
        System.out.println("After capitilising first letter of each word: " +s);
    }
}
