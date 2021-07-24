package Arrays;

import java.util.Scanner;

public class ArraysAssignment7 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter length of array");
        int len=scannerObject.nextInt();
        int array[]=new int[len];
        System.out.println("enter elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
        System.out.println("actual array:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("actual array:");
        for(int i=1;i<array.length;i=i+2){
            System.out.print(array[i]+" ");
        }
    }
}
