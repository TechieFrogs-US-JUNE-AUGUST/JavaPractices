package strings;

import java.util.Scanner;

public class String17 {  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String Name :");
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
        char a= str.charAt(i); 
        System.out.print(a + " ,  ");
        }
        System.out.println();

        sc.close();
    }
    
}
