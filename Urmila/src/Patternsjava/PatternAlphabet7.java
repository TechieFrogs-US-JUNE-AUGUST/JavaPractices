package Patternsjava;

public class PatternAlphabet7
{
    public static void main(String[] args)
    {
        int i, j;
        for(i=6;i>=1;i--)
            {                     
            int ch=70;
            for(j=1;j<=i;j++)
            {
                System.out.print((char)ch+" ");
                --ch;
            }
                System.out.println();
             }
    }
    
}
