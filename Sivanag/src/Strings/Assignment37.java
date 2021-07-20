//Find duplicate Character in a string
package Strings;
public class Assignment37 {
    public static void main(String[] args) {
        {
            String string ="adfasfafaf";
            for(int i=0;i<string.length();i++)
            {
                int c=0;
                for(int j=i+1;j<string.length();j++)
                {
                    if(string.charAt(i)==string.charAt(j))
                    {
                        c=1;
                        string=string.substring(0, j)+string.substring((j+1));
                        //System.out.println(string);
                        j--;                 
                    }
                    
                }
                //System.out.println(string);
                if(c==1)
                System.out.println(string.charAt(i) +" is a Duplicate Character");

            }
        }
    }
    
}
