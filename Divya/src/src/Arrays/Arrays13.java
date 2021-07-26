package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays13 {
    public static void main(String[] args) {
        int arr[] = new int[7];               //declaration and initialising a array variable
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length;i++ ){           // loop to take user input values
            arr[i]=s.nextInt();
        }
        System.out.println("before:"+Arrays.toString(arr));     // method to store the array values in string
        rightRotate(arr,3);                            //calling created method to rotate the given elements
        System.out.println("after:"+Arrays.toString(arr));
        }
        public static void rightRotate(int[] arr1,int n){           //method created to rotate the elements
             for(int i=0;i<n;i++) {
                 int last=arr1[arr1.length-1];          //created variable to store last array element
                 for(int j=arr1.length-1;j>0;j--){
                     arr1[j]=arr1[j-1];               //last but one element takes the position of last index
                 }
                   arr1[0]=last;                 // last element of array is stored in first index
             }

        }
    }