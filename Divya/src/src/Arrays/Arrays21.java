package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays21 {
    public static void main(String[] args) {
        int arr[] = new int[5];                  //declaring and initialising array variables
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {            //loop to take he user input values
             arr[i]=s.nextInt();
        }
        System.out.println("original numerical array:"+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
        }
        Arrays.sort(arr);                                     //method to sort the array elements
        System.out.println("After sorting the array elements:"+Arrays.toString(arr));
    }
}