package Assignment;

import java.util.Scanner;

public class Assignment3 
{
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
    String str=scannerObj.nextLine();
    int[] array= new int[256]; //ascii table
    for(int i=0;i<str.length();i++)
    {
        array[str.charAt(i)]=array[str.charAt(i)]+1; // increments the value 
    }
    int max=-1;
    char ch=' ';
    for(int i=0;i<str.length();i++)
    {
        if(max<array[str.charAt(i)])// if it satisfices
        {
            max=array[str.charAt(i)]; // the value is storedin max
            ch=str.charAt(i); // character is stored in ch
        
        }
    }
    System.out.println("Maximum Repeated Character is :" +ch);
    scannerObj.close();
    }
    
}
