package Patternsjava;

public class Pattern5 
{
    public static void main(String[] args)
    {
        int i,j;
        for(i='A';i<='F';i++)
            {                     
            for(j='F';j>=i;j--)
            {
                System.out.print(j);
                
            }
            System.out.println();
            }
    }
    
}
