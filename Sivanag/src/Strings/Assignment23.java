//Total Number of Punctuation characters in a string
package Strings;
import java.util.Scanner;
public class Assignment23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        int v=0;
        int c;
        for(int i=0;i<s.length();i++)                                                       //for loop to go to every character of the string
        {
            c= s.charAt(i); 
            if((32< c && c < 48) || (57 < c && c < 65)||(90<c && c<97) || (122<c && c<126)) //check current character is Punctuation character are not using ascii code of punctuation symbols        
            v++;
        }

        System.out.println("Total Number of Punctuation Characters are  " + v);
        sc.close();
    }

    
}
