//TO COUNT THE TOTAL NUMBER OF VOWELS AND CONSONANTS IN A STRING
package Strings_Assignment;

public class Prog24 {
    public static void main(String[] args) {
        String s="My name is Sri Sravya";
        int vowels=0, consonants=0;

        s=s.toLowerCase();                      //converting to lower case
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            vowels++;
            }
            else if((ch>='a' && ch<='z')){
                consonants++;
            }
        }
            System.out.println("Vowels: " +vowels);
            System.out.println("Consonants: " +consonants);
        }
    }       
