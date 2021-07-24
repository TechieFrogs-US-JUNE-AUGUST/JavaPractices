//TO FIND THE DUPLICATE CHAR IN THE STRING
package Strings_Assignment;

public class Prog37 {
    public static void main(String[] args) {
        String s="Sri Sravya";
        char array[]= s.toCharArray();                    //converts the string into a sequence of characters
        System.out.println("Original string is: " +s);
        System.out.println("Duplicate characters in the above string are: ");

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(array[i]==array[j]){
                    System.out.println(array[j]+ " ");
                }
            }
        }
    }
}
