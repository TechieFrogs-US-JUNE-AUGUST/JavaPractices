package StringAssignments;

public class PrintSmallestandBiggestPalindrome
{
    public static boolean checkPalin(String word)//Function to check if a word is palindrome
    {
        int n = word.length();
        word = word.toLowerCase();       // making the check case ( case insensitive)
  
        for (int i = 0; i < n; i++, n--) // loop to check palindrome
        {
            if (word.charAt(i) != word.charAt(n - 1))
                return false;
        }
        return true;
    }
    public static void lengthPalindrome(int temp, String words[])// Determine the smallest and biggest palindromes in a given string
    { 
        int count = 0;
        String smallest = "", longest = "";
        
        for (int i = 0; i < temp; i++)
         {          
          if (checkPalin(words[i]))
            {
             count++;
            if (count == 1)// Initialize smallest and longest when first palindromic word is found
                smallest = longest = words[i];
              else       // Compare smallest and longest with each palindromic words
              {
                 if (smallest.length() > words[i].length())
                    smallest = words[i];// If length of smallest is greater than next palindromic word then Store that word in smallest
                    if (longest.length()< words[i].length())
                        longest = words[i];// If length of longest is less than next palindromic word then Store that word in longest
                }
            }
        }
  
        if (count == 0)
            System.out.println("No palindrome found");
        else
         {  
            System.out.println("Smallest palindrome: " + smallest);
            System.out.println("Biggest palindrome: " + longest);
        }
    }
  
    public static void main(String[] args)
    {
        
        String string = "Wow anna this is your racecar";
        String word = "";
        
        String[] words = new String[100];
        int temp = 0;
        string = string + " "; // add extra spaceafter string to get lastword
  
        for (int i = 0; i < string.length(); i++)
         {
            if (string.charAt(i) != ' ')// Split the string into words 
            {
                word = word + string.charAt(i);
            }
            
            else
             {
                words[temp] = word;// Add word to array words
                temp++;
                word = "";
            }
        }
        
        System.out.println("Inputted String : " + string);
        lengthPalindrome(temp, words);
    }
    
}
