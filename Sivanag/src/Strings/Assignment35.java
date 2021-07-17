//Find Minimum and Maximum occuring character in a string
package Strings;
public class Assignment35 {
    public static void main(String[] args) {
        String string ="adfasdf";
        for(int i=0;i<string.length();i++)
        {
            int h=0;
            for(int j=i+1;j<string.length();j++)
            {
                if(string.charAt(j)==(string.charAt(i)))
                h++;

            }



        }
    }

    
}
