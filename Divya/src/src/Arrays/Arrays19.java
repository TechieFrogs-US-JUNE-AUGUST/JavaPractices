package Arrays;
import java.util.Scanner;
public class Arrays19 {
   static int arr[]=new int[5];
    public static void duplicate(int arr2[]){
        int j=0;
        for(int i=0;i<arr2.length-1;i++){
            if(arr2[i]!=arr2[i+1]){
                arr2[j++]=arr2[i];
            }
        }
        arr2[j++]=arr2[arr2.length-1];
        System.out.println("After remove duplicate elements in array are:");
        for(int k=0;k<j;k++){
            System.out.println(arr2[k]);
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        duplicate(arr);
    }
}