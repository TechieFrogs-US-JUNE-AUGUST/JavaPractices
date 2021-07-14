package Patterns;

public class Assignment8 {
    public static void main(String[] args) {
        //int max=10;
        int num;
        int inc=0;
        for(int i=1;i<=10;i++)
        {
            num=10-i+1;
            for(int j=1;j<=i+inc;j++)
            {
                if(i==1)
                System.out.print(0);
                else
                {
                
                if(((i+inc)/2)+1==j)
                System.out.print(0);
                else if((i+inc)/2>j)
                {
                System.out.print(num);
                if(j!=(i+inc-2))
                num++;
               
                }else
                {
                    System.out.print(num);
                    if(j>(i+inc-(j+1)))
                    num--;

                }
                
               
                }
            }
            inc++;
            System.out.println("");
        }

    }
    
}
