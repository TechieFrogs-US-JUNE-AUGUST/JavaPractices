
package Tarak;
import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Character");
        char ch=sc.next().charAt(0);
        if (ch=='a'| ch=='b'|ch=='c'|ch=='d'|ch=='e'|ch=='f'|ch=='g'|ch=='h'|ch=='i'|ch=='j'|ch=='k'|ch=='l'|ch=='m'|ch=='n'|ch=='o'|ch=='p'|ch=='q'|ch=='r'|ch=='s'|ch=='t'|ch=='u'|ch=='v'|ch=='w'|ch=='x'|ch=='y'|ch=='z'){
            System.out.println("Given character is Alphabet");
        }
        else if(ch=='A'|ch=='B'|ch=='C'|ch=='D'|ch=='E'|ch=='F'|ch=='G'|ch=='H'|ch=='I'|ch=='J'|ch=='K'|ch=='L'|ch=='M'|ch=='N'|ch=='O'|ch=='P'|ch=='Q'|ch=='R'|ch=='S'|ch=='T'|ch=='U'|ch=='V'|ch=='W'|ch=='X'|ch=='Y'|ch=='Z') {
            System.out.println("Given character is Alphabet");
        }
        else {
            System.out.println("It is not an Alphabet");
        }
    }
}
