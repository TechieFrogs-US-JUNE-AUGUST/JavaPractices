import java.util.Scanner;
public class DiamondPattern {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i)*2;j++){
            System.out.print(" ");
        }
        /*int k=0;
        while (k!=2*i-1){
            System.out.print("* ");
            k++;*/
        for (int k=i;k>=1;k--){
            System.out.print(" *");
        }
    for (int l=2;l<=i;l++) {
        System.out.print(" *");
    }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=(n-i)*2;j++){
            System.out.print(" ");
        }
        for (int k=i;k>=1;k--){
            System.out.print(" *");
        }
        for (int l=2;l<=i;l++){
            System.out.print(" *");
        }
        System.out.println();
    }
    } 
    
}
