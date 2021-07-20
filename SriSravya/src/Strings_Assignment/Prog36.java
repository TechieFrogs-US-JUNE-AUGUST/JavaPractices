package Strings_Assignment;

public class Prog36 {
    public static void main(String[] args) {
        String s="Sri Sravya";
        String reverseString= "";             //stores the reverse of the given string

        for(int i=s.length()-1; i>=0; i--){                //iterates the string from the last
            reverseString= reverseString+ s.charAt(i);    //stores the iterated character in reverseString
        }
        System.out.println("Reverse of the string is: " +reverseString);
    }
}
