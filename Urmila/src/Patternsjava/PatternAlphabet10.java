package Patternsjava;

public class PatternAlphabet10 
{
    public static void main(String[] args)
    {
        int i,j;
        int ch= 65;
          for ( i = 0; i <= 5; i++)
          {
            for ( j = 0; j <= i; j++)
            {
             System.out.print((char) ch + " ");
             ch++;
            }
             System.out.println();
        }
    }    
}
