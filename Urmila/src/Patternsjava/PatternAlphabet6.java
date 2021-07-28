package Patternsjava;

public class PatternAlphabet6 
{
    public static void main(String[] args)
    { 
        int i,j;
        for(i=0;i<=5;i++)
        {                      
            int ch=65;
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
                
            }
            for(int k =0 ; k<=i;k++)
            {
            System.out.print((char)(ch + k)+ ""); 
            }
            System.out.println();
       /* int i,j;
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
        */
        }
    }
    
}
