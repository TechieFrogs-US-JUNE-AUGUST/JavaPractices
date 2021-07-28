package Patternsjava;

public class PatternsAlphabet5 
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=5;i>=0;i--)
            { 
               int  ch = 65;                    
            for(j=i;j>=0;j--)
            {
                System.out.print((char)(ch+j)+ ""); 
            }
            ch++;
            System.out.println();
            }
            for(i=0;i>=0;i--)
            { 
            int  ch = 65;                    
            for(j=i;j>=0;j--)
            {
            System.out.print((char)(ch+j)+ ""); 
            }
            ch++;
            System.out.println();
        }
    }
}
