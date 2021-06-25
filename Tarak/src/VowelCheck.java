

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter alphabet");
        char ch=sc.next().charAt(0);
        if (ch=='a' | ch=='A'){
            System.out.println("Given Alphabet is Vowel");
        }
        else if (ch=='e'|ch=='E'){
            System.out.println("Given Alphabet is Vowel");
        }
        else if (ch=='i'|ch=='I'){
            System.out.println("Given Alphabet is Vowel");
        }
        else if (ch=='o'|ch=='O'){
            System.out.println("Given Alphabet is Vowel");
        }
        else if (ch=='u'|ch=='U'){
            System.out.println("Given Alphabet is Vowel");
        }
        else{
            System.out.println("Given Alphabet is Consonant");
        }
    }
}
