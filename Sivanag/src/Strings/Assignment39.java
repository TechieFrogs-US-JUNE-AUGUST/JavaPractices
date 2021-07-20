//Find the frequecy of characters in a string
package Strings;
public class Assignment39 {
    static char[] sortChar(char ch[])
    {
        char c1=' ';
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]>ch[j])
                    {
                        c1=ch[i];
                        ch[i]=ch[j];
                        ch[j]=c1;
                    }

            }
        }
        return ch;
    }
    public static void main(String[] args) {
        String string="fdasffdadsfafds";
        System.out.println("Given string is :"  +string);
        char ch[]=string.toCharArray();
        char ch1[]=Assignment39.sortChar(ch);
        for(int i=0;i<ch1.length;i++)
        {
            int k=1;
            for(int j=i+1;j<ch1.length;j++)
            {
                if(ch1[i]==ch1[j])
                {
                    k++;
                    i++;
                }
            }
            System.out.println("'"+ch1[i]+"':"+(k));
        }
       }
}
