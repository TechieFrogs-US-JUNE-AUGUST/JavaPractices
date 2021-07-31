package ExceptionHandling;
import java.util.Scanner;
public class Exception11 {
    public static void arrException(int arr[]){
        try{
            for(int i=1;i<arr.length+1 ;i++){           // if length increases the size of an array it will throw exception
                System.out.println(arr[0]);
            }
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Array out of bound");
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int size;                                        // scanner object for taking inputs  from the user
        System.out.println("enter the size of an array:");
        size=s.nextInt();
        int a[]=new int[size];
        System.out.println("enter the elements of an array:");
        for(int i=1;i<a.length;i++){
            a[i]=s.nextInt();
        }
        arrException(a);
    }
}