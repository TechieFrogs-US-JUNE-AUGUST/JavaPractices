package Arrays;
import java.util.Scanner;
public class Arrays29 {
    public static void main(String[] args){
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];       // creating two matrices
        int c[][]=new int[3][3];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=s.nextInt();              // for loop to take the input from the end user
                //  b[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                //  a[i][j]=s.nextInt();              // for loop to take the input from the end user
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("elements of first array:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("elements of second array:");
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("multiplication of two matrices are:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++) {                //created another matrix to store the values of 2 matrices
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}