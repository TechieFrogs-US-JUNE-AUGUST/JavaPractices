import java.util.Scanner;
public class PascalTriangle 
{
    public static void main(String[] args) 
    {
         int i,j;  // temp=1;
         Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows n=:");
         int n = sc.nextInt(); 
    for(i=1; i<=n; i++)
       {
          for(j=n;j>i;j--)
            {
              System.out.print(" ");
            }
        
            for(int temp=1,k=1; k<=i; k++)
              {
                System.out.print(temp + " ");
                temp=temp*(i - k)/(k);
              }
            System.out.println();
       }
        sc.close(); 
    }
}