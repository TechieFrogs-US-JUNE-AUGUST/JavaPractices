package StringAssignments;

public class longestRepeatingInString 
{
    static String repeatingString(String s1,String s2)
    {
        int length=Math.min(s1.length(),s2.length());
        for(int k=0;k<length;k++)
        {
            if(s1.charAt(k)!=s2.charAt(k))
              return s1.substring(0,k);
        }
          return s2.substring(0,length);
    }
    public static void main(String[] args){
        String string="This is Java Program";
        String string1="";
        for(int i=0;i<string.length();i++)
        {
            for(int j=i+1;j<string.length();j++)
            {
                String string2=repeatingString(string.substring(i,string.length()),string.substring(j,string.length()));
                if(string2.length()>string1.length())
                 string1=string2;
            }
        }
        System.out.println("longest repeating sequence is:"+string1);
}
}
