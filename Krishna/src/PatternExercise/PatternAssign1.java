package PatternExercise;

public class PatternAssign1 
{
   public static void main(String[] args) 
   {
        int i=1;                                    //i is for  * position
        for(int j=1;j<=5;j++)                       //j is no of rows to print
        {
            for(int k=5;k>=1;k--)                   //k is to print numeric value
            {
            if(k==j)                                
            {
            System.out.print("*");                  // Print * in the i position.
            }else
            System.out.print(k);                    
        }
        i++;                                        
        System.out.println("");                     
        }
    }
}