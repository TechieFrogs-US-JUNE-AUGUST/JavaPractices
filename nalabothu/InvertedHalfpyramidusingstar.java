import java.util.Scanner;
public class InvertedHalfpyramidusingstar
 {
     public static void main(String[] args)
     {
         int n;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter n value");
         n=sc.nextInt();
         for(int i=n;i>=1;i--)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
            
         }
     }
    
}
