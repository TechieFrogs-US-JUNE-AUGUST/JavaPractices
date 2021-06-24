import java.util.Scanner;
class diamondshape
{
    

    public static void main(String args[])
    {
        System.out.print("Enter the Number of Rows you want to print : ");
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int k=0;
        for(int i=1;i<=n;i++)
        {
            
            for (int j=1;j<=(n*2);j++)
            {
                //System.out.print((n/2));
                if((j>=((n)-k)) && (j<=((n)+k)))
                System.out.print("*");
                else
               System.out.print(" ");
          
            }
            System.out.println("");
        k++;
            }
        
            int y =n-1;
            for(int l=1;l<=n;l++)
            {
                
                for (int m=1;m<=(n*2);m++)
                {
                    //System.out.print((n/2));
                    if((m>=((n)-y)) && (m<=((n)+y)))
                    System.out.print("*");
                    else
                   System.out.print(" ");
              
                }
                System.out.println("");
           y--;
                }
    
       
        sc.close();

    }


}
