package StringAssignments;

public class CheckStringUsingIndex 
{
    public static void main(String[] args)
    {
        String s1 = "This is java Program";
        String str1 = "Program";
        String str2 = "Programming";
    
    
        int result = s1.indexOf(str1); // check if str1 is present in s1 using indexof()
        if(result == -1) 
        {
          System.out.println(str1 + " not is present in the string.");
        }
        else
        {
          System.out.println(str1 + " is present in the string.");
        }
    
        
         result = s1.indexOf(str2);// check if str2 is present in s1 using indexOf()
         if(result == -1)
          {
          System.out.println(str2 + " is not present in the string.");
          }
          else
          {
           System.out.println(str2 + " is present in the string.");
          } 
    }
}
