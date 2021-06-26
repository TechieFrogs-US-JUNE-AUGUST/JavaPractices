package Assignment.java;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        char alphabet;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the alphabet");
        alphabet=sc.next().charAt(0);
        switch(alphabet){
            case 'a' , 'A':
                System.out.println("given alphabet is vowel");
                break;
            case 'e', 'E':
                System.out.println("given alphabet is vowel");
                break;
            case 'i','I':
                System.out.println("given alphabet is vowel");
                break;
            case 'o','O':
                System.out.println("given alphabet is vowel");
                break;
            case 'u', 'U':
                System.out.println("given alphabet is vowel");
                break;
            default:
                System.out.println("given alphabet is consonant");
                break;
                //sc.close();
        } sc.close();
    }
}
