package Arrays;

import java.util.Scanner;

public class ArraysAssignment9 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter length of array");
        int len=scannerObject.nextInt();
        int array[]=new int[len];
        System.out.println("enter elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
        int temp=array[0];
        for(int i=0;i<array.length;i++){
            
            if(array[i]>temp){
                temp=array[i];
            }
        }
        System.out.println("largest element of array "+temp);
    }
}
