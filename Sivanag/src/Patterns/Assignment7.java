package Patterns;
/*
Pattern

12344321
123**321
12****21
1******1
*/



public class Assignment7 {
    public static void main(String[] args) {
        int max=8;
        int mid =(max/2)+1;
        int num;
        for(int i=1;i<mid;i++)
        {
            
           int k=0;
           int n=1;
            for(int j=1;j<=max;j++)
            {
                if (j<mid)
                {
                    
                if(j>=mid-k-(i-1))
                {
                System.out.print("*");
                k++;
                }
                else
                System.out.print(j);
            }
        
        else
        {
            num=j;
            int n1=0;
                    if(j>=mid)
                    {
                        num =num-n;
                        n+=2;
                    }
            if(num>mid-i-n1)
                {
                    System.out.print("*");
                    n1++;
                }else
                System.out.print(num);

        }
            
            }
            System.out.println("");
            //else
           // {
                // n=5;
                // for(int l=mid-1;l>0;l--)
                // {
                //     if(l>mid-i+1+n)
                //     {
                //         System.out.print("*");
                //         n--;
                //     }else
                //     System.out.print(l);
                // }
                // System.out.println("");
           // }
        }

    }
    
}
