//Find duplicate words in a string
package Strings;
public class Assignment38
{
    static Boolean dupWords(String[] s,String c,int l)
    {
        for(int i=0;i<=l;i++)
        {
            if(s[i].equals(c))
            return true;
        }
        return false;
    }
public static void main(String[] args) {
    //String string="fd fd ffd fsdf ffd dfds fdfa ffd  38 39  ";
    String string = "Strings Assignment Strings Assignment  38 39  40  ";
    String string1[]=string.split("\s");
    for(int i=0;i<string1.length;i++)
    {
        int c=0;
        if(dupWords(string1 ,string1[i],i) || i==0)
        {
        for(int j=i+1;j<string1.length;j++)
        {
            if(string1[i].equals(string1[j]) && string1[i] != "")
            {
            c=1;
            }
        }
    }
        if(c==1)
        System.out.println(string1[i] +" is a duplicate word");

    }
   
}
}