class FullPyramid1nnn
{
    public static void main(String args[])
    {
        int n=10;
        int k=(n/2)-1;
        for(int i=1;i<=n/2;i++)
        {
            
            for (int j=1;j<=n;j++)
            {
                //System.out.print((n/2));
                if((j>=((n/2)-k)) && (j<=((n/2)+k)))
                System.out.print("*");
                else
               System.out.print(" ");
          
            }
            System.out.println("");
        k--;
            }
           
        }
    }

