import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
       int n,i,j,k=0;
       System.out.println("Enter n value: ");
       Scanner scan=new Scanner(System.in);
       n=scan.nextInt();

       for(i=n;i>=1;i--,k=0){
       for(j=1;j<=n-i;j++){
       System.out.print(" ");           //Prints Space
       }
       while(k!=2*i-1){
           System.out.print(" *");      //Prints Star
           k++;
       }
       System.out.println(" ");
       }
    }
}