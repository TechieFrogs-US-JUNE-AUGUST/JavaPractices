package StringAssignments;

public class SeparateTheIndividualCharacters 
{
    public static void main(String[] args)
    {
        String string = "java program";
        System.out.println( "Individual characters from given string: ");// Displays individual characters from given string
 
        for (int i = 0; i < string.length(); i++)// iterate through string to display charactes
         {
            System.out.print(string.charAt(i) + " ");
         }
    }
    
}
