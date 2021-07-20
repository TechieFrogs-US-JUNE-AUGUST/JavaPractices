package Strings_Assignment;

public class Prog35 {
    public static void main(String[] args) {
        String s="Sri Sravya";
        String revereString="";                  //stores the reverse of the string

        for(int i=s.length()-1; i>=0; i--){
            revereString= revereString+ s.charAt(i);          //stores the every iterated value in reverseString
        }
        System.out.println("Original String is: " +s);
        System.out.println("Iterated String is: " +revereString);
    }
}
