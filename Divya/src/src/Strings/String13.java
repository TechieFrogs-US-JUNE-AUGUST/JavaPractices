package Strings;

public class String13 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("This");           // create a string buffer
        s1.append(" is my");                                   // add string to string buffer  by using keyword append
        s1.append(" laptop");
        System.out.println("StringBuffer: " + s1);
        s1.setLength(0);                                         // clear the string         // using setLength()
        System.out.println("After clear of StringBuffer: " + s1);
    }
}

