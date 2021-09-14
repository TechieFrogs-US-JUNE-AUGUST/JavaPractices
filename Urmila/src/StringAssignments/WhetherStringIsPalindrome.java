package StringAssignments;

public class WhetherStringIsPalindrome
{
    public static void main(String[] args)
    {
        String str="racecar", reverseStr="" ;
        int strLength=str.length();

        for(int i=(strLength-1); i>=0; i--)
        {
            reverseStr= reverseStr + str.charAt(i);//it  stores the reverse value of string
        }
        if(str.toLowerCase().equals(reverseStr.toLowerCase()))//used to check main and reverse string
        {        
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }
    
}
