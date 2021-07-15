package Strings;

public class Asssignment9 {
    char[] String2Char(String s)
    {
        char ch[] = new char[s.length()];
        for(int i=0;i<=s.length();i++)
        {
            ch[i]=s.charAt(i);

        }
        return ch;

    }
    public static void main(String[] args) {
        String ss ="Race";
        String ss1 ="Care";
        Asssignment9 obj9= new Asssignment9();
        char c[]=obj9.String2Char(ss);
        char c1[]=obj9.String2Char(ss1);
        char chk;
        if(c.length==c1.length)
        {
            int hh=0;
        for(int j=0;j<c.length;j++)
        {
            
            for(int k=0;k<c1.length;k++)
            {
                    if(c[j]==c1[k])
                    {
                        hh++;
                    break;
                    }else
                    if(Character.isUpperCase(c[j]))
                        {
                            chk=Character.toLowerCase(c[j]);
                        }
            }

        }
    }
    }
      


}
