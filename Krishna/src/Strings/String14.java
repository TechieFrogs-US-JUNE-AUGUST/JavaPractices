package Strings;
public class String14 
{
    public static void main(String[] args) 
    {
        StringBuffer strbuff= new StringBuffer("Strings Assignment");
        
        System.out.println("String Buffer : " +strbuff);
        System.out.println(strbuff.length());

        strbuff= new StringBuffer();                                   //Creating New Object with empty string buffer
        System.out.println("String Buffer :" +strbuff);
        System.out.println(strbuff.length());
    }
}