package StringAssignments;

public class IterateUsingForLoop 
{
    public static void main(String[] args)
    {
        String name = "Himansh";          //create a string
        System.out.println("characters in" + name + "are ");

        for(int i = 0; i<name.length();i++)
        {
            char ch = name.charAt(i);     //accessing each character
            System.out.print(ch + ",");
        }

    } 
    
}
