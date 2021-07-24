//TO REPLACE THE SPACES OF THE STRING WITH A SPECIFIC CHAR
package Strings_Assignment;

public class Prog32 {
    public static void main(String[] args) {
        String s="My name is Sri Sravya";
        char ch=':';

        s=s.replace(' ', ch);          //replace old char ' ' with new char ch which is ':'
        System.out.println("After replacing space with new char: " +s);
    }
}
