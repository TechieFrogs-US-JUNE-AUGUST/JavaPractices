package Strings;
//To find all subsets of string
import java.util.Scanner;

public class Assignment27 {
    public static void main(String[] args) {
        Scanner scannerobj= new Scanner(System.in);      //scanner object
        System.out.println("Enter the String ");
        String string =scannerobj.nextLine();   
        String s="";
        for(int i=0;i<string.length();i++)              //for loop till i reaches string length
        {
            System.out.print(string.charAt(i) +" ");    //print character
            s=Character.toString(string.charAt(i));     
            for(int j=i+1;j<string.length();j++)        //for loop from next i to string length
            {
            s=s+string.charAt(j);                       //append previous character to current character
            System.out.print(s +" ");   

            }
        }
        scannerobj.close();
    }

}
