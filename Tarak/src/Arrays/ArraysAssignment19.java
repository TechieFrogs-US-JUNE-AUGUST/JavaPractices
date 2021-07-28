package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAssignment19 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter length of array");
        int len=scannerObject.nextInt();
        int[] array=new int[len];
        System.out.println("enter elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
        System.out.println("original array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("sorted array");
        for(int i=0;i<array.length;i++){
            Arrays.sort(array);   // sorting in ascending order
            System.out.print(+array[i]+" ");
        }
        
        int temp=0;
        for(int i=0;i<array.length-1;i++){
            if(array[i]!=array[i+1]){  // comparing element at i position with i+1 position
                array[temp]=array[i];  // storing element of i position in temp position
                temp++;  // incrementing position value
            }
        }
        array[temp++]=array[array.length-1];  // assigning value to last position
        System.out.println();
        System.out.println("array with no duplicates");
        for(int i=0;i<temp;i++){
            System.out.print(array[i]+" ");
        }
    }
}
