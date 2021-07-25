package Patterns;

import java.util.Scanner;

public class SpiralPayyern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of matrix");
        int n=sc.nextInt();
        int minRow=0,minCol=0,maxRow=n-1,maxCol=n-1;//declaring boundries
        int i=1;
        int [] [] M =new int  [n][n];
        while(i<=(n*n)){
            for(int j=minCol;j<=maxCol;j++) //running from left to right making minimum row constant
            M[minRow][j]=i++;
            for(int j=minRow+1;j<=maxRow;j++)//running from top to bottom making maximum coloumn constant
            M[j][maxCol]=i++;
            for(int j=maxCol-1;j>=minCol;j--)//running from right to left making maximum row constant
            M[maxRow][j]=i++;
            for(int j=maxRow-1;j>=minRow+1;j--)//running from bottom to top making minimum row constant
            M[j][minCol]=i++;
            minCol++;      
            minRow++;     // repeating the above cycle by incrementing min values and decrementing max values till i=n*n
            maxCol--;
            maxRow--;
        }
        for(i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print(M[i][j]+ " ");
            System.out.println(" ");
        }
    }
}
