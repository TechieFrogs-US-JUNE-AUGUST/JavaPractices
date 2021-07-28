//TO PRINT THE ELEMENTS OF AN ARRAY IN REVERSE ORDER
package Arrays_Assignment;

import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
      //int array[]= new int[]{1,2,3,4,5,6};                  //initialisation
        Scanner scannerObject= new Scanner(System.in);        //reading i/p from user using scanners
        System.out.println("Enter the size of an Array");
        int size= scannerObject.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of an Array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
        System.out.println("Original array elements are: ");
        for(int i=0; i<array.length; i++){             
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        for(int i=array.length-1; i>=0; i--){           //for loop through the array which prints the elements in reverse order
            System.out.print(array[i]+" ");
        }
        scannerObject.close();
    }
}
