import java.util.Scanner;
public class LeftPascalTriangle{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter no of lines to be printed");
        int n=sc.nextInt();                                      // n is the no of rows.
    int i,j,k;                         
 for(i=1;i<=n;i++)
 {
     for(j=4 ; j>=i; j--)
     {
         System.out.print(" ");
     }
     for(k=1;k<=i; k++)
     {
         System.out.print( "*");
     }
        System.out.println();
 }   
 for(i=1;i<=n ;i++)
 {
     for(j=1;j<=i; j++)
     {
        System.out.print(" ");
     }
     for(k=n-1; k>=i; k--)
     {
         System.out.print("*");
     }
     System.out.println();
 }sc.close();
}
}