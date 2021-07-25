//TO PRINT THE ELEMENTS OF AN ARRAY
package Arrays_Assignment;
import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size= scannerObject.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of an Array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
       // int array[]= new int[]{1,2,3,4,5,6};            //initialsing an array
        System.out.println("Elements of the array are: ");
        for(int i=0; i<array.length; i++){              //for loop goes throgh the array by incrementing value of i
            System.out.println(array[i]+" ");
        }
        scannerObject.close();
    }
}
