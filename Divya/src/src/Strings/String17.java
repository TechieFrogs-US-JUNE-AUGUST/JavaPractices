package Strings;

public class String17 {
    public static void main(String[] args) {
        String n = "sridivya";                         // create a string
        System.out.println("Characters in " + n + " are:");
        for(int i = 0; i<n.length(); i++) {                     // loop through each element
            char ch = n.charAt(i);                              //// access each character
            System.out.print(ch + ", ");
        }
    }
}

