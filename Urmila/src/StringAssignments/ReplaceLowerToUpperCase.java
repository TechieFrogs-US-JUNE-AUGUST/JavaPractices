package StringAssignments;

public class ReplaceLowerToUpperCase
{
 public static void main(String[] args)
 {
    String s1="Java Programming";
    StringBuffer str=new StringBuffer(s1);                     

      for(int i=0; i<s1.length(); i++)
        {
           if(Character.isLowerCase(s1.charAt(i)))//checking if the letter is lowercase
            {                     
              str.setCharAt(i, Character.toUpperCase(s1.charAt(i)));//setting the char to uppercase using toUppercase()
            }
            else if(Character.isUpperCase(s1.charAt(i)))//checking if the letter is uppercase
            {                 
              str.setCharAt(i, Character.toLowerCase(s1.charAt(i))); //setting the char to uppercase using toLowercase()
            }
        }
             System.out.println("After replacing: " +str);
 }   
}
