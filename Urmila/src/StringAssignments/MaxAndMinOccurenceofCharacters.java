package StringAssignments;

public class MaxAndMinOccurenceofCharacters
{
    public static void main(String[] args)
    {
    String str = "This is java program";  
        int[] freq = new int[str.length()];  
        char minChar = str.charAt(0), maxChar = str.charAt(0);  
        int i, j, min, max;          
            
        char string[] = str.toCharArray();//Converts given string into character array
          
        for(i = 0; i < string.length; i++)
         {  
            freq[i] = 1;  
            for(j = i+1; j < string.length; j++)
             {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0')
                 {  
                    freq[i]++;   
                    string[j] = '0';  
                }  
            }  
        }  
        min = max = freq[0];  //Determine mini and max occurring characters  
        for(i = 0; i <freq.length; i++) 
        {  
                
            if(min > freq[i] && freq[i] != '0')
            {  //If min is greater than frequency of a character then, store frequency in min and corresponding character in minChar
                min = freq[i];  
                minChar = string[i];  
            }  
    
            if(max < freq[i])
            {  //If max is less than frequency of a character then, store frequency in max and corresponding character in maxChar  
                max = freq[i];  
                maxChar = string[i];  
            }  
        }  
          
        System.out.println("Minimum occurring character: " + minChar);  
        System.out.println("Maximum occurring character: " + maxChar);  
    
}
}