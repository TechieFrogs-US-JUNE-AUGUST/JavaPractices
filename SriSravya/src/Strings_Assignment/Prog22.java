package Strings_Assignment;

public class Prog22 {
    public static void main(String[] args) {
        String s="My name is Sri Sravya";
        int count=0;

        for(int i=0; i<s.length(); i++){                
            if(s.charAt(i)!=' ')                  //counts each character except space
            count++;
        }
        System.out.println("Number of characters in the string are: " +count);
    }
}
