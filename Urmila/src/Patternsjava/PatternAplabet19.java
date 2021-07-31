package Patternsjava;

public class PatternAplabet19 
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
                ch++;
            }
            for(int k =0 ; k<=i;k++)
            {
            System.out.print((char)(ch + k)+ ""); 
            }
            System.out.println();
        }
    }
    
}
