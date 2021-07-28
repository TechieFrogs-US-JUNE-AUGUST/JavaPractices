package Arrays;

import java.util.Scanner;

public class Arrays18 {
    public static void min(int[] arr) {
        int min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min1) {
                min2 = min1;
                min1 = i;
            }
            else if (i < min2) {
                min2 = min1;
                min2 = i;
            }
        }
        System.out.println("second smallest element:"+min2);
    }
    public static void main(String[] args) {
        int arr1[]=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        min(arr1);
    }
}