package Arrays;

import java.util.Scanner;

public class ArraysAssignment35 {
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
        double sum=0;
        double mean;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        System.out.println();
        mean=sum/len;
        System.out.println("mean: "+mean);
        double variance=0;
        for(int i=0;i<array.length;i++){
            variance=variance+Math.pow((array[i]-mean), 2)/len;
        }
        System.out.println("variance: "+variance);
        double standardDeviation=Math.sqrt(variance);
        System.out.println("standard deviation: "+standardDeviation);
    }
}
