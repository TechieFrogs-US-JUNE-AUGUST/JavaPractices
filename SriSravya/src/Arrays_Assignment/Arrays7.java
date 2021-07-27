//TO PRINT THE ELEMENTS OF AN ARRAY PRESENT ON EVEN POSITION
package Arrays_Assignment;

import java.util.Scanner;

public class Arrays7 {
    public static void main(String[] args) {
       //int array[]= new int[]{1,2,3,4,5,6};                //initialisation
       Scanner scannerObject= new Scanner(System.in);        //reading i/p from user using scanners
        System.out.println("Enter the size of an Array");
        int size= scannerObject.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of an Array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
        System.out.println("Elements of an array present in even position are: ");
        for(int i=1; i<array.length; i=i+2){           //for loop through the array by incrementing i value by 2
            System.out.println(array[i]);             //i value starts with 1 because the first even position is at 1st index
        }
        scannerObject.close();
    }
}
