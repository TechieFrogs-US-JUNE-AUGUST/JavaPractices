package STRINGS;

public class StringBufferobject 
{
    public static void main(String[]args)
    {
        StringBuffer s1= new StringBuffer();
        s1.append("Strings");
        s1.append("is");
        s1.append("finalclass");
        System.out.println("StringBuffer:"+s1);

        s1= new StringBuffer();
        System.out.println("updated StringBuffer:" + s1);
    }
}
