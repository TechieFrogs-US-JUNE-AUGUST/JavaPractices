package Practice;

public class Searchletter2 {
    static void searchLetter1(String s,char c)
    {
        char ch[]=s.toCharArray();
        int num=s.indexOf(c);
        int k=0;
        if(num<0)
        System.out.println(num +" No Occurance of "+ c);
        else
        {
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==c)
            {
                k++;
            }
        }
        System.out.println(k +" Number of Occurances of "+ c);
    }
    }
    public static void main(String[] args) {
        searchLetter1("quick brown fox jumps over the lazy dog", 'a');
    }
    
    
}
