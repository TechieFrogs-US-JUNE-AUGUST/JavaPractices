package Patterns;

public class Assignment4 
{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            int sum=0;
            for(int j=1;j<=i;j++)
            {
                sum=sum+i;
                System.out.print(sum +" ");


            }
            System.out.println("");
        }
    }
}
