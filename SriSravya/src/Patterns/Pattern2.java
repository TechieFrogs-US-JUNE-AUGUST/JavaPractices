package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int letter=65;              //ASCII value of A is 65  
       for (int i=0; i<=5; i++) {          //for rows   
           for (int j=0; j<=i; j++) {       //for columns    
           System.out.print((char) letter + " ");  
             }  
           letter++;  
           System.out.println();  
         }       
      }
   }
