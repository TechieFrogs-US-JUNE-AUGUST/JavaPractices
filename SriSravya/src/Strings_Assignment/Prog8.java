//CHECK IF A STRING IS NUMERIC
package Strings_Assignment;

public class Prog8 {
   public static void main(String[] args) {
       String s= "12345";
       int num= 0;
       
       for(int i=0; i<s.length(); i++){
           if(Character.isDigit(s.charAt(i))){
              num++;
           }
        }
           if(num==s.length()){
               System.out.println("The string is Numeric");
           }
           else{
               System.out.println("The string is not numeric");
           }  
       }
   } 
