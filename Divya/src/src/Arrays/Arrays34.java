package Arrays;
import java.util.Scanner;
public class Arrays34 {
    public static void average(int a[]) {
        int sum = 0;double average;                     //created array to find the average of array
        System.out.println("average value of given array :");
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];}
             average = sum / a.length;
        System.out.println(average);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int size;                             // scanner object to take the inputs from the user
        System.out.println("enter the size of an array:");
        size=s.nextInt();
        int a1[]=new int[size];
        System.out.println("enter the elements of an array:");
        for(int i=0;i<a1.length;i++){             // loop to read the input values
            a1[i]=s.nextInt();
        }
        average(a1);                            //calling method
    }
}