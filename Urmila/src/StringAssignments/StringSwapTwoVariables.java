package StringAssignments;

public class StringSwapTwoVariables 
{
    public static void main(String[] args)
    {
        String s1 = "String";
        String s2 = "program ";    
        System.out.println("Strings before swapping: " + s1 + " " + s2);    
           
       s1 = s1 + s2;    //Concatenate both the string s1 and s2 
           
       s2 = s1.substring(0, (s1.length() - s2.length())); //Extract s2 from  s1   
        
       s1 = s1.substring(s2.length());                   //Extract s1 from  s1       
           
       System.out.println("Strings after swapping: " + s1 + " " + s2); 
    } 
    
}
