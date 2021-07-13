package Patterns;



public class Assignment1
{
    public static void main(String[] args) {
        int k=1;                                    //k is a variable to check * position
                for(int i=1;i<=5;i++)               //i is a variable to number of rows to print
        {
            for(int j=5;j>=1;j--)                   //j is a variable to Print value
            {
            if(k==j)                                //if condition to check for * Position
            {
            System.out.print("*");                  // Print *
            }else
            System.out.print(j);                    //Print Value of j
        }
        k++;                                        
        System.out.println("");                     //Next line
        }
      
        
    }

}