package src.Assignment_Wipro;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter Old Password: ");
        String oldPwd=scannerObj.nextLine();        //Input Old Password
        char ch[] =oldPwd.toCharArray();            //Convert exach Character of string into Character Array
        for(int i=0;i<ch.length;i++)                //goto Each Character using for loop
        {
            if(Character.isLowerCase(ch[i]))        //if condition to check Character is lowercase
            {
                ch[i]=Character.toUpperCase(ch[i]); //convert character to Uppercase
            }else
            ch[i]=Character.toLowerCase(ch[i]);     //else convert charater to Lowercase
        }
        System.out.print("New password is : "+ String.valueOf(ch));//Print new Password
        scannerObj.close();
    }   
}
