package Assignment.java;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        char alphabet;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the alphabet");
        alphabet=sc.next().charAt(0);
        switch(alphabet){
            case 'a':
                System.out.println("given alphabet is vowel");
                break;
            case 'e':
                System.out.println("given alphabet is vowel");
                break;
            case 'i':
                System.out.println("given alphabet is vowel");
                break;
            case 'o':
                System.out.println("given alphabet is vowel");
                break;
            case 'u':
                System.out.println("given alphabet is vowel");
                break;
            case 'A':
                System.out.println("given alphabet is vowel");
                break;
            case 'E':
                System.out.println("given alphabet is vowel");
                break;
            case 'I':
                System.out.println("given alphabet is vowel");
                break;
            case 'O':
                System.out.println("given alphabet is vowel");
                break;
            case 'U':
                System.out.println("given alphabet is vowel");
                break;
                default:
                System.out.println("given alphabet is consonant");
                break;
                //sc.close();
        } sc.close();
    }
}
