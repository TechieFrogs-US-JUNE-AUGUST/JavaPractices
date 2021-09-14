import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a Character ");
        Scanner sc=new Scanner(System.in);
        char ch= sc.next() . charAt(0);
        sc.close();
        if(ch =='a'|| ch =='e' || ch =='i'||ch =='o'||ch=='u'||ch=='A' || ch=='E' || ch=='I'||ch=='O'||ch=='U')
            System.out.println("Given Character is a Vowel");
        else if((ch>='a'&& ch<='z') || (ch>='A' && ch<= 'Z') )
                System.out.println("It is a Consonant");
        else
            System.out.println("Not an Alphabet");
    }
}
