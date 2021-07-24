package Arrays;

import java.util.Scanner;

public class ArraysAssignment6 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter length of array");
        int length=scannerObject.nextInt();
        int array[]=new int[length];
        System.out.println("enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
        System.out.println("printing input array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("reversed input array");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }

    }
}
