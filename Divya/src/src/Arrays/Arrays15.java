package Arrays;
import java.util.Scanner;
public class Arrays15 {
    public static void decending(int arr[]){       // method to get values in decending  order
        int temp=0;                                   // created temp variable to store the array value
        System.out.println("The order of array elememts in decending order");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){           //loop to sort the arrays in decending order
                if(arr[i]<arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                }
            }
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){                //main method
        int arr1[]=new int[5];
     Scanner s=new Scanner(System.in);                    //created scanner object
     for(int i=0;i<arr1.length;i++){
         arr1[i]=s.nextInt();
     }
     decending(arr1);                                  // calling method to print the vslues
    }
}