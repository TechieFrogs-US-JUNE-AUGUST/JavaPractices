package StringsAssignment;

import java.util.Scanner;

public class StringsAssignment8 {
    public static void main(String[] args){
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter string");
        String string=scannerObject.nextLine();
        int temp=0; // declaring temp
        for(int i=0;i<string.length();i++){ // getting each character in string 
            if(Character.isDigit(string.charAt(i))){ //comparing weather string contains any numeric value or not using Charcter.isDigit-predefined method
                temp++; 
            }
        }
        if(temp==string.length())
        System.out.println("Given String is Numeric");
        else
        System.out.println("Given String is Non Numeric");
        scannerObject.close();
        
    }
}
