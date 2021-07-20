package strings;

import java.util.Scanner;

public class String29 {
    public static void main(String[] args) {
        
    Scanner scannerobj= new Scanner(System.in);      //scanner object
        System.out.println("Enter the String ");
        String string =scannerobj.nextLine();   
        String s="",m,m1="";
        for(int i=0;i<string.length();i++)              //for loop till i reaches string length
        {
           m=string.substring(0, i+1);
           m1=string.substring(i+1);
            s=m+m1;

             System.out.println(s+" ");
 
        }
        scannerobj.close();
}
    
}
