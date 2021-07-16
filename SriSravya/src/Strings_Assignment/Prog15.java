package Strings_Assignment;

public class Prog15 {
    public static void main(String[] args) {
        String s="sravya";
        String firstLetter= s.substring(0, 1);                   //this substring has first letter of string s
        String remainingLetters= s.substring(1, s.length());   //this substring contains remaining letters
 
        firstLetter= firstLetter.toUpperCase();               //converts to uppercase
        s= firstLetter + remainingLetters;                   //after converting join the 2 substrings
        System.out.println("Name is: " +s);
    }
}
