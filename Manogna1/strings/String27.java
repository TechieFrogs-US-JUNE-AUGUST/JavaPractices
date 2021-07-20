package strings;

import java.util.Scanner;

public class String27 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=scannerObj.nextLine();
        int length=str.length();
        int temporary=0;
        String str1[]=new String[length*(length+1)/2];
        for(int i=0;i<length;i++)
        {
            for(int j=1;j<length;j++)
            {
                str1[temporary]=str.substring(i, j+1);
                temporary++;
            }
        }
        System.out.println("All subsets of given String are :");
        for(int i=0;i<str1.length;i++)
        {
            System.out.println(str1[i]);
        }
        scannerObj.close();
        
    }
    
}
