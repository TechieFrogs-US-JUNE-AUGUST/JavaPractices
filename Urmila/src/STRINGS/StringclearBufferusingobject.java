package strings;

public class StringclearBufferusingobject
{
    public static void main(String[] args)
    {
        StringBuffer s1 = new StringBuffer();           // create a string buffer
        s1.append("this");                              // adding string to string buffer
        s1.append(" is");
        s1.append(" java program");
        s1.append("using string");
        System.out.println("StringBuffer: " + s1);
        s1 = new StringBuffer();                        // clear string buffer by using this method
        System.out.println("Updated StringBuffer: " + s1);
    }
    
}
