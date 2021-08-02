package Practice;

public class SearchLetters {
    static void searchLetter(String s,char c)
    {
        char ch[]=s.toCharArray();
        int k=0,m=0,n=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==c)
            {
                if(k==0)
                {
                k=1;
                m=i;
                }          
             }
            else if(k>0 && ch[i]!=' ')
            {
                if(dupchar(ch, ch[i],m, i))
                {
                System.out.print(ch[i] + " ");
                n++;
                }
            }
        }
        System.out.println();
        System.out.println("Total number of Characters between two occurances is: "+n);

    }
    static Boolean dupchar(char[] ch,char c,int from,int to)
    {
        for(int i=from;i<to;i++)
        {
            if(ch[i]==c)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
       searchLetter("my name is granar", 'a');
    }
    
}
