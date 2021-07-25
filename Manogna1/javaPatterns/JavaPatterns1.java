package javaPatterns;


public class JavaPatterns1 
{
    public static void main(String[] args) 
    {
        int i,j;                    //we need to  variables to print number ofn lines and numbers

        for(i=1;i<=5;i++){          // print number of lines

            for(j=5;j>=1;j--)       // print the numbers
            {
                if(j!=i)
                    System.out.print(j);            //print numbers
                    else
                    System.out.print("*");
                
            }
            System.out.println();
        }
        
    }
}
