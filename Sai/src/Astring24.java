import java.util.Scanner;
public class Astring24{
    public static void main(String[] args){
        int vowels = 0, consonant = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();
        int n = str.length();
         for (int i = 0; i < n; i++) { //checks entire string
            char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')//checks for vowels
                    vowels++;
                else  if(ch != ' ')  // if not it will give consonants value
                    consonant++;
        }
        System.out.println("Vowels :"+ vowels +" Consonants : "+consonant);
        sc.close();
    }
}