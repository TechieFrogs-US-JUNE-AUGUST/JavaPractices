//TO CHECK WHETHER THE GIVEN STRING IS PALINDROME 
package Strings_Assignment;

public class Prog33 {
    public static void main(String[] args) {
        String str="Madam", reverseStr="" ;
        int strLength=str.length();

        for(int i=(strLength-1); i>=0; i--){
            reverseStr= reverseStr + str.charAt(i);        //to  store the reverse value
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase())){        //condition to check main string is equal to reverse of string
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
