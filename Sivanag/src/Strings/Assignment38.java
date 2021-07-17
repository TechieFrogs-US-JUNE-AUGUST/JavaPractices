//Find duplicate words in a string
package Strings;

public class Assignment38
{
public static void main(String[] args) {
    String string="fd fd ffd fsdf ffd ";
    String string1[]=string.split(" ");
    for(int i=0;i<string1.length;i++)
    {
        int c=0;
        for(int j=i+1;j<string1.length;j++)
        {
            if(string1[i].equals(string1[j]))
            {
            c=1;
            }

        }
        if(c==1)
        System.out.println(string1[i] +" is a duplicate word");

    }

    
}

}