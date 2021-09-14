package tcscodingquestions;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter Three Words");
        String s1=scannerObj.nextLine();
        String s2=scannerObj.nextLine();
        String s3=scannerObj.nextLine();
        char c;
        String str1=" ",str2=" ",str3=" ";
        for(int i=0;i<s1.length();i++)
        {
            c = s1.charAt(i);
			if(c == 'A' || c == 'a' || c == 'E' || 
                           c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
                           {
                            str1 = str1 + "%";
                           }
                           else
                           {
                            str1=str1+c;
                           }
			
            
        }
        for(int i=0;i<s2.length();i++)
        {
            c = s2.charAt(i);
			if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z'))
			{
				if(c == 'A' || c == 'a' || c == 'E' || c == 'e' || 
                            c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
					str2 = str2 + c;
				else
					str2 = str2 + "#";
			}
			else
				str2 = str2 + c;
        }
        str3=s3.toUpperCase();
        System.out.println(str1+str2+str3);
        scannerObj.close();
    }
    
}
