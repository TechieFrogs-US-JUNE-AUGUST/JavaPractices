package Patternsjava;

public class PatternAlphabet1
 {
    public static void main(String[]args)
    {
        int i,j;
        for(i=1;i<=6;i++)
        {                      
            int ch=65;
            for(j=1;j<=i;j++)
            {
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    } 
}