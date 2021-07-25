package Arrays;

import java.util.Scanner;
public class ArraysAssignment4 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter length of array");
        int length=scannerObject.nextInt();
        int array[]=new int[length];
        System.out.println("enter the elements of array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
        System.out.println("duplicate elements are");
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.print(+array[i]+" ");
                }
               
            }
        }
    }
}
