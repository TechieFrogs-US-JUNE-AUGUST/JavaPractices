                        //Input Character is alphabet or not
import java.lang.String;
import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String[] args) {
        char ch;
        Scanner s=new Scanner(System.in);
        System.out.println("enter any Character");
        ch=s.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println("enter input is an Alphabet");}
        else{
            System.out.println(" enter input is not an Alphabet");
            s.close();
        }
    }
}