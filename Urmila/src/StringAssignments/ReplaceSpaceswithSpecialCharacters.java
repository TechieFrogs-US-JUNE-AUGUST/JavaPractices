package StringAssignments;

public class ReplaceSpaceswithSpecialCharacters 
{
    public static void main(String[] args)
    {
        String s1 = "Welcome to hyderabad";
        char ch = '$';
        s1=s1.replace(' ', ch);         
        System.out.println("After replacing space with new char: " +s1);
  
        System.out.print("Return Value :" );
        System.out.println(s1.replace( '$', ch));
        
    }
    
}
