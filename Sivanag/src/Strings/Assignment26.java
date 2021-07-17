package Strings;
//Divide a string into N equal parts
import java.util.Scanner;

public class Assignment26
{
  public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in);                                                           
    System.out.println("Enter the String"); 
    String string= scannerObj.nextLine();
    System.out.println("Enter the number of parts to divide the string : ");
    int parts = scannerObj.nextInt();
    int stringlen=string.length()/parts;
    for(int i=0;i<string.length();i+=stringlen)                                     //repeat the for loop until string ends and increment i value by stringlen
    {
         System.out.println(string.substring(i, i+stringlen-1));                    // print strings equal parts
    }
    scannerObj.close();                                                         
     
  }  
}