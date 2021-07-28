package StringAssignments;

public class LargestAndSmallestWordInString 
{
    public static void main(String[] args)
    {
        String string = "This is my new program in string in java";    
        String word = "", small = "", large = "";    
        String[] words = new String[100];    
        int length = 0;       
        string = string + " "; // Adding extra space ,to get last word in the string   
          
        for(int i = 0; i < string.length(); i++)
        {       
          if(string.charAt(i) != ' ')//Split the string into words 
          {    
              word = word + string.charAt(i);    
          }    
          else
          {       
              words[length] = word;  //Add word to array words       
              length++;              //Increment the length       
              word = "";             //Make word on empty string 
          }    
      }                
          small = large = words[0];//Initialize small and large with first word in the string
              
          for(int k = 0; k < length; k++)//Determining smallest and largest word in the string
          {    
               
          if(small.length() > words[k].length()) //If length of small is greater than any word present in the string Store value of word into small    
             small = words[k];    
       
          if(large.length() < words[k].length()) ////If length of large is less than any word present in the string Store value of word into large   
              large = words[k];    
      }    
           System.out.println("Smallest word: " + small);    
           System.out.println("Largest word: " + large); 
    }
    
}
