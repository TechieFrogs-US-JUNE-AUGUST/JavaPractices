package Patterns;

/*
1     1
 2   2
  3 3
   4
  3 3
 2   2   
1     1

*/
public class Assignment5 {
    public static void main(String[] args) {
        int max=7;
        int mid =(max/2)+1;
        int n=2;
        int num;
        for(int i=1;i<=max;i++)
        {
            num=i;
            if(i>mid)
            {
                num =num-n;
                n+=2;
            }

            for(int j=1;j<=max;j++)
            {
                if((j==i)||(j==(max-(i-1))))
                {
                  
                System.out.print(num);
                }
                else
                System.out.print(" ");
            }
            System.out.println("");
        }
    }   
}
