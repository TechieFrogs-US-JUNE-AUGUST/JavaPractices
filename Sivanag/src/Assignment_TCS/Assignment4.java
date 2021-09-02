package src.Tcs_Assignment;

import java.util.Scanner;
public class Assignment4 {
static void customCaeserCiphar(int key,String message)
{
    char[] ch= message.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
        if(Character.isAlphabetic(ch[i]))
        {
            if((ch[i]!='z') && (ch[i]!='Z'))
            ch[i]+=key;
        }
    }
    System.out.println(String.valueOf(ch));
}
static int intputInteger()
{
    Scanner scObject=new Scanner(System.in);
    int num;
        while(!scObject.hasNextInt())
        {
            System.out.println("Enter Positive Number");
            scObject.next();
        }
        num=scObject.nextInt();
    scObject.close();
    return num;
    
}
public static void main(String[] args) {
    Scanner scannerObject=new Scanner(System.in);
    System.out.print("Enter the String:");
    String string=scannerObject.nextLine();
    System.out.print("Enter Key: ");
    int key=intputInteger();
    if(key<0)
    {
        System.out.println("Invalid Input");
    }else
    customCaeserCiphar(key, string);
    scannerObject.close();
}  
}
