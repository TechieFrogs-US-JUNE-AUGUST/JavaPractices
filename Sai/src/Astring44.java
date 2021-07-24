import java.util.Scanner;
public class Astring44{    
    public static void main(String[] args) { 
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give the 1st string : ");
        String str1 = scannerObj.nextLine();   
        System.out.println("Give the 2nd string : ");
        String str2 = scannerObj.nextLine(); 
        System.out.println("Strings before swapping: String1 - " + str1 + ", String2 -  " + str2);       
        str1 = str1 + str2;  //string concatination    
        str2 = str1.substring(0, (str1.length() - str2.length()));
        //extracted string1 from the total string using the index locations
        str1 = str1.substring(str2.length()); //getting string2 from concated string1 by index  
        System.out.println("Strings after swapping: String1 - " + str1 + ", String2 - " + str2);    
        scannerObj.close();
    }    
}
