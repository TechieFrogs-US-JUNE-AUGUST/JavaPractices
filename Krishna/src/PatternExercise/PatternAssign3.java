package PatternExercise;

public class PatternAssign3                      // Pascal Casing
{
    public static void main(String [] args)
    {
        int i;                                   // i= no of rows
        int j;                                   // j= no of columns
    for(i=1; i<=4;i++)
    {
        for(j=1; j<=4;j++)
        {
            if(i==j)
            System.out.print("*");
            else 
            System.out.print("0");
        }
        j--;
        System.out.print("*");
        while(j>=1)
        {
            if (i==j)
              System.out.print("*");
              else
              System.out.print("0");
              j--;
        }
        System.out.println("");
    }
    }
}