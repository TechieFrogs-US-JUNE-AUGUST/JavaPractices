//Check String is Numeric 
package Strings;
import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s= scannerObject.nextLine();
        //String s = "122356sss";
    int num=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))                  //Character.isDigit() is predefined keyword to check characer is digit are not
            {
                num++;
            }
        }
        if(num==s.length())
        System.out.println("Given String is Numeric");
        else
        System.out.println("Given String is Non Numeric");
        scannerObject.close();
        
    }
   
}
