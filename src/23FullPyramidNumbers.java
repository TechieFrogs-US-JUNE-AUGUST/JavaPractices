class FullPyramidNumbers
{
    public static void main(String args[])
    {
        int n=10;
        int k=0;
        for(int i=1;i<=n/2;i++)
        {
            int h=0;
            for (int j=1;j<=n;j++)
            {
                //System.out.print((n/2));
                
                if((j>=((n/2)-k)) && (j<=((n/2)+k)))
                {
                    if(j<=((n/2))){
                    System.out.print(i+h +" ");
                    h++;}
                    else
                    {
                        h--;
                        System.out.print(i+h-1 + " ");
                    }
                }
                else
               System.out.print(" ");
          
            }
            System.out.println("");
        k++;
            }
           
        }
    }

