package WiproAssignment;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Input");
        String str=scannerObj.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)=='!') || (str.charAt(i)=='@') ||(str.charAt(i)=='#') || (str.charAt(i)=='$') ||(str.charAt(i)=='%')||(str.charAt(i)=='^')||(str.charAt(i)=='&')||(str.charAt(i)=='*')||(str.charAt(i)=='(')||(str.charAt(i)==')'))
            count++;
        }
        System.out.println("OUTPUT  " +count);
        scannerObj.close();
    }
    
}
