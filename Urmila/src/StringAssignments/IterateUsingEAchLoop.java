package StringAssignments;

public class IterateUsingEAchLoop 
{
    public static void main(String[] args)
    {
        String name = "String method";      // creating a string
        System.out.println("characters in "+ name + "are");

        for(char ch : name.toCharArray())
        {
            System.out.print( ch +",");

        }
        
    }
    
}
