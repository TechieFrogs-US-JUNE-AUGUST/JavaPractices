package Arrays;
import java.util.Scanner;
public class Arrays6 {
   static int arr[]=new int[5];
    int arraySize=arr.length;
    public static void reverse(int arr[]) {
        int arr1 = arr.length;
        System.out.println("reverse of  given array elements are:");
        for (int i = arr1-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            for(int i=0;i<arr.length;i++){
                arr[i]=s.nextInt();
            }
        reverse(arr);
    }
}