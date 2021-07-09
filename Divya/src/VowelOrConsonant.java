                             // To find vowel or consonant
import java.util.Scanner;
import java.lang.String;
public class VowelOrConsonant {
    public static void main(String[] args){
        char c;
      System.out.println("enter any alphabet");
      Scanner s=new Scanner(System.in);
      c=s.next().charAt(0);
      if((c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')){
      System.out.println("enter character is vowel");}
      else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
           System.out.println("enter character is consonant");}
      else{
          System.out.println("invalid input");
          s.close();
      }
    }
}