package Strings;

public class String countpunctuationcharacters
{
    public static void main(String[]args)
    {
        int count=0;
        String s1 = "My email Id: urmila.dhanala@gmail.com:";
        for (int i = 0; i < s1.length(); i++)
        {                     
            char ch = s1.charAt(i);
            if (ch == '!' || ch == '@' || ch == '$' || ch == '#' || ch == '&')
            {
                count++;
            }
        }
        System.out.println("number of punctuations in a given string :" +count); 
    
    }
    public String replace(char c, char ch) {
        return null;
    }
    public char[] toUpperCase() {
        return null;
    }
    public int length() {
        return 0;
    }
    public String charAt(int i) {
        return null;
    }
    public int substring(int i) {
        return 0;
    }
    
}
