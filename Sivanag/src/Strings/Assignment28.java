package Strings;

public class Assignment28 {
        static String lcs(String s,String s1)
        {
            int len = Math.min(s.length(), s1.length());
            for(int k=0;k<len;k++)
            {
                if(s.charAt(k)!=s1.charAt(k))
                return s.substring(0, k);
            }
            return s.substring(0, len);
        }
    public static void main(String[] args) {
        String string="abcdbcda";
        String string1 ="";
        for(int i=0;i<string.length();i++)
        {
            for(int j=i+1;j<string.length();j++)
            {
                String string2 = lcs(string.substring(i, string.length()),string.substring(j,string.length()));
                if(string2.length()> string1.length())
                string1=string2;
            }
           

        }
        System.out.println("Longest Repeating Sequence is: " +string1);
    }
    
}
