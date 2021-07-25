//TO FIND THE LARGEST AND SMALLEST WORD IN A STRING
package Strings_Assignment;

public class Prog40 {
    public static void main(String[] args) {
        String s1="aaaa bbb cc d";
        String s2[]= s1.split(" ");                            //separating the words in the string using split
        String stringLarge= s2[0];
        String stringSmall= s2[0];

        for(int i=0; i<s2.length; i++) {
            if(stringLarge.length()<s2[i].length())                //checking for the largest word
                stringLarge =s2[i];
                if(stringSmall.length()>s2[i].length())                //checking for the smallest word
                stringSmall= s2[i];        
        }
        System.out.println("Largest Word in a string is "  +stringLarge);
        System.out.println("Smallest Word in a string is "  +stringSmall);
    }
}
