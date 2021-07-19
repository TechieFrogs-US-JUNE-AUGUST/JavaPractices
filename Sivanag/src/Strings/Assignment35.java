//Find Minimum and Maximum occuring character in a string
package Strings;
public class Assignment35 {
    static Boolean dupchar(String s,char c)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String string ="this is sivanag";
        int max=0;
        int min=string.length();
        char maxc=' ';
        char minc=' ';
        for(int i=0;i<string.length();i++)
        {
            if(dupchar(string.substring(0, i),string.charAt(i))==false || i==0)
            {
            int h=1;
            for(int j=i+1;j<string.length();j++)
            {
                if(string.charAt(j)==(string.charAt(i)))
                h++;

            }
            if(h>max){
                max=h;
                maxc=string.charAt(i);
            }
           
            if(h<min)
            {
                min=h;
                minc=string.charAt(i);
            }
            


        }
    }

        System.out.println("Maximum Occurance character in a string "+ string + " is :"+ maxc+ " "+ max);
        System.out.println("Minimum Occurance character in a string "+ string + " is :"+ minc+ " "+min);
    }

    
}
