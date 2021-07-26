package Arrays;

import java.util.Scanner;

public class ArraysAssignment13 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter length of array");
        int length=scannerObject.nextInt();
        int array[]=new int[length];
        System.out.println("enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
        System.out.println("enter no of left rotations to happen ");
        int noOfRotations=scannerObject.nextInt();
        System.out.println("original array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
       
        for(int i=0;i<noOfRotations;i++){
            int temp=array[length-1];
        for(int j=length-1;j>0;j--){
            array[j]=array[j-1];
        }
        array[0]=temp;
    }
    System.out.println();
    System.out.println("right rotated array");
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }
    }
}
