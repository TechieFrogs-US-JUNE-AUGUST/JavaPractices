//TO COUNT THE TOTAL NUMBER OF PUNCTUTATION CHAR IN A STRING
package Strings_Assignment;

public class Prog23 {
    public static void main(String[] args) {
        String s="Hi!I am Sravya.Had your lunch?";
        int count=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='!'|| s.charAt(i)==','|| s.charAt(i)==':'|| s.charAt(i)==';'|| s.charAt(i)=='.'|| s.charAt(i)=='?'){
            count++;
            }
        }
            System.out.println("Total number of punctuation characters are: " +count);
    }
}
