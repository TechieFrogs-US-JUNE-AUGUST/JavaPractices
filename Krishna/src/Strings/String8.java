package Strings;

public class String8 
{
   public static void main(String[] args) 
   {
       String str= "12345a";
       int num= 0;
       
       for(int i=0; i<str.length(); i++)
       {
           if(Character.isDigit(str.charAt(i)))      //character.isdigit is used to check whether it is numeric or not
           {
              num++;
           }
        }
           if(num==str.length())
           {
               System.out.println( str+ " is Numeric");
           }
           else
           {
               System.out.println( str+ "  is not numeric");
           }  
       }
   }