//Replace spaces with specified character
package Strings;
import java.util.Scanner;
public class Assignment32 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        
        System.out.print("Enter String : ");
        String string=scannerObject.nextLine();
        String temp=string;
        System.out.print("Enter letter to replace with  space : ");
        char ch=scannerObject.nextLine().charAt(0);
        string=string.replace( ' ', ch); 
        System.out.println(temp + " " +string);
        scannerObject.close();
    }
    
}