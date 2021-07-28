package Patternsjava;

public class PatternsAlphabet  
{
    public static void main(String[] args)
    {
        int i, j;
        for(i=0;i<=5;i++)
            {                     
            int ch=65;
            for(j=0;j<=i;j++)
            {
                System.out.print(((char) ch)+"+");
                ch++;
            }
                System.out.println();
             } 
       
    }
}

    