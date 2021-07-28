package Arrays;

import java.util.Scanner;

public class Arrays24 {
    public static void sparse(int arr[][]) {                 //method
        int count = 0;                               //initialise the count as zero
        int size=0;                                 // set size as zero
        for (int i = 0; i < arr.length; i++) {
             size = arr.length * arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {              //condition to satisfy the sparse matrix
                    count++;
                }
            }
        }
        if(count>size/2){                                  // if the count is greater than the size it is sparse matrix
            System.out.println("given matrix is sparse matrix");
        }
        else{
            System.out.println("given matrix is not a sparse matrix");
        }
    }
    public static void main(String[] args) {
        int arr1[][]=new int[3][3];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){                   // Scanner object to take the input from the users
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=s.nextInt();
            }
        }
        sparse(arr1);                                 //method calling
    }
}

