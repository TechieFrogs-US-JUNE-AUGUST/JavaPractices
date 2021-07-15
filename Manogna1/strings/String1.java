package strings;

public class String1 {
    public static void main(String[] args) {
        String str="This is Program 1 in Strings Assignment";
        int vowels=0;
        int digits=0;
        int spaces=0;
        int consonants=0;
        str=str.toLowerCase(); // converts everything into lowercase

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i); // it returns the char at index i
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') //to check the character if it is vowel
            {
                vowels++;
            }
            else if(ch >='a' && ch <='z') //check the character in between a to z
            {
                consonants++;
            }
            else if(ch>= '0' && ch<= '9')// check the character in between 0 to 9
            {
                digits++;
            }
            else if(ch == ' ') //check for Spaces
            {
                spaces++;
            }

        }  
            System.out.println("Vowels : " +vowels);
            System.out.println("Consonants :" +consonants);
            System.out.println("Digits : " +digits);
            System.out.println("Spaces : " +spaces);
    
    }
}
