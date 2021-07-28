package Patterns;

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner scannerobj = new Scanner(System.in);
        System.out.println("Enter the String");         // reading the i/p from the user
        String input = scannerobj.nextLine();

        for(int i=1; i<=input.length(); i++) {           //for rows
            for(int j=input.length(); j>i; j--){         //prints space at the start of each row
                System.out.print(" ");
            }
            for(int k= i*2-1; k>=1; k--){                //for columns to print the characters in each row
                System.out.print(input.charAt(i-1));
            }
            System.out.println("");
        }
        scannerobj.close();
    }
}
