package Arrays;

import java.util.Scanner;

public class Arrays25 {
    public static void equal(int a[][],int b[][]){
            int rows1, coloms1, rows2, coloms2;
            boolean result = true;
            rows1 = a.length;             //Calculates the number of rows and columns present in the first matrix
            coloms1 = a[0].length;
            rows2 = b.length;              //Calculates the number of rows and columns present in the second matrix
            coloms2 = b[0].length;
            //Checks if dimensions of both the matrices are equal
            if(rows1 != rows2 || coloms1 != coloms2){
                System.out.println("given matrices  are not equal");
            }
            else {
                for(int i = 0; i < rows1; i++){
                    for(int j = 0; j < coloms1; j++){
                        if(a[i][j] != b[i][j]){
                            result = false;
                            break;
                        }
                    }
                }
                if(result)
                    System.out.println("given matrices are equal");
                else
                    System.out.println("Matrices are not equal");
            }
        }
        public static void main(String[] args){
        int arr[][]=new int[3][3];                    // initialsation of two dimensional array arr
        int brr[][]=new int[3][3];                    // initialising second dimensional array brr
            Scanner s = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {         // scanner to take input from the end user
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = s.nextInt();
                }
            }
            for (int i = 0; i < brr.length; i++) {
                for (int j = 0; j < brr[i].length; j++) {
                    brr[i][j] = s.nextInt();
                }
            }
            equal(arr,brr);                         // calling a method
        }
    }

