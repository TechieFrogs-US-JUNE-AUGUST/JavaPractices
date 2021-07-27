package Arrays;

import java.util.Scanner;

public class ArraysAssignment14 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter length of string");
        int len =scannerObject.nextInt();
        int array[]=new int[len];
        System.out.println("enter elements of arrays ");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
        int temp=0;
        System.out.println("input array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("ascended sorted output");
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                temp =array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        System.out.print(array[i]+" ");
    }
    scannerObject.nextInt();
}
}
