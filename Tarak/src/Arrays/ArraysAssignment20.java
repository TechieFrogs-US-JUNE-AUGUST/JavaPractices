package Arrays;

import java.util.Scanner;

public class ArraysAssignment20 {
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
        System.out.println(" even numbers of input array");
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
        System.out.println(" odd numbers of input array");
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                System.out.print(array[i]+" ");
            }
        }
    }
}
