package Strings_Assignment;
//COUNT THE NUMBER OF VOWELS, CONSONANTS, DIGITS AND SPACES IN A SENTENCE
public class Prog1 {
    public static void main(String[] args) {
        String s="My name is Sri Sravya21";
        int vowels=0, consonants=0, digits=0, spaces=0;
        s=s.toLowerCase();                        //converts all chars to lowercase
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);                  

            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){       //checks for vowels
            vowels++;
        }
            else if((ch>='a' && ch<='z')){                           //checks for consonants
                consonants++;
        }
            else if((ch>='0' && ch<='9')){                          //checks for digits
                digits++;
        }
            else if(ch== ' '){                                     //checks for spaces
                spaces++;
        }
    }
    System.out.println("Vowels: " +vowels);
    System.out.println("Consonants: " +consonants);
    System.out.println("Digits: " +digits);
    System.out.println("Spaces: " +spaces);
  }
}


