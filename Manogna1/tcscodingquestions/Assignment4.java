
package tcscodingquestions;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter Plain Text");
        String message=scannerObj.nextLine();
        System.out.println("Enter the Key :");
        int key=scannerObj.nextInt(); 
        System.out.println("Encripted Message :");
        CustomCaesarCipher(key, message);
        scannerObj.close();
        
    }
   static void CustomCaesarCipher(int key, String message) 
    {
        String str="";
        char ch=' ';
        if(key<0)
        {
            System.out.println("Invalid Input");
        }
        else{
            for(int i=0;i<message.length();i++)
            {
                char c=message.charAt(i);
                if(c>=65 && c<=90) // Ascii value for A to Z
                {
                    ch= (char)((c+key-65)%26+65);// to get the value and stores in c as we are having 26 alphabets % with 26 and adding with starting value ie 65
                    //type casting is req to change the value to char
                }
                else if(c>=97 && c<=122) // Ascii value for a to z
                {
                    ch= (char)((c+key-97) % 26 +97); // as we are having alphabets % with 26 and adding with 97(staring letter a)
                }
                else if(c>=48 && c<=57) // ASCII velue for 0 to 9
                {
                    ch=(char)((c+key-48) % 10+48); //as we are having numbers fro 0 to 9 we % with 10 and adding with 48(starting with 0)
                }
                else
                {
                    ch=c;
                }
                str=str+ch;
                
            }
            System.out.println(str);
        }
        
    }
    
}
