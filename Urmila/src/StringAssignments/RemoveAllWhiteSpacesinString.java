package StringAssignments;

public class RemoveAllWhiteSpacesinString 
{
    public static void main(String[] args)
    {
        String s1 = "String is derived type";
         System.out.println("Before removing white spaces:" +s1);

         s1 = s1.replaceAll("\\s",""); // (//s) used to find all white spaces in the string
          // replaced with "" (empty string is represented as "")
         System.out.println("After removing :" +s1);
    } 
    
}
