package StringAssignments;

public class DuplicateCharacters
{
    public static void main(String[] args)
    {
        String string1 = "Java string is immutable ";
        int count;

        char string[] = string1.toCharArray();  //Converts  into character array
        System.out.println("Duplicate characters in a given string: "); 
        for(int i = 0; i <string.length; i++) 
        {
            count = 1;
            for(int j = i+1; j <string.length; j++)
            {
                if(string[i] == string[j] && string[i] != ' ') 
                {
                    count++;         //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            if(count > 1 && string[i] != '0')  //A character is considered as duplicate if count is greater than 1
                System.out.println(string[i]);
        }
        
    }
    
}
