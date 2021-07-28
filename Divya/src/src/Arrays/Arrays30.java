package Arrays;

import java.util.Scanner;

public class Arrays30 {
    public static void sumClomsRows(int arr[][]){         // method to print the sum of values of rows ans coloms
        for(int i=0;i<arr.length;i++){
            int rowsum=0;
            for(int j=0;j<arr[i].length;j++){
              rowsum=rowsum+arr[i][j];
            }
            System.out.println("sum of elements in"+(i+1)+"row is:"+rowsum);
        }
        for(int i=0;i<arr[i].length;i++){
            int colomSum=0;
            for(int j=0;j<arr.length;j++){
                colomSum=colomSum+arr[i][j];
            }
            System.out.println("sum of elements in"+(i+1)+"colom is:"+colomSum);
        }
    }
    public static void main(String[] args){                 // main method
        int arr1[][]=new int[3][3];                     //initialising the array variables
        Scanner s= new Scanner(System.in);
        for(int i=0;i<arr1.length;i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
        sumClomsRows(arr1);                      // calling method to print addition of rows and coloms
    }
}