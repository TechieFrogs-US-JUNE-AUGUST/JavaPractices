package Arrays;
import java .util.Scanner;
public class Arrays5 {
    public static void main(String[] args){
        int arr[]=new int[10];
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]= scannerObject.nextInt();}
        System.out.println("the elements of given array are:");
            for(int i=0;i<arr.length;i++) {
                System.out.println(arr[i]);
            }
    }
    }