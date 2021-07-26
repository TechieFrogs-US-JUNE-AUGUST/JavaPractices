//TO PRINT THE NUMBER OF ELEMENTS PRESENT IN AN ARRAY
package Arrays_Assignment;

import java.util.Scanner;

public class Arrays11 {
   public static void main(String[] args) {
      //int array[]= new int[]{1,2,3,4,5,6};                      //initialsing the array
       Scanner scannerObject= new Scanner(System.in);        //reading i/p from user using scanners
        System.out.println("Enter the size of an Array");
        int size= scannerObject.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of an Array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
       System.out.println("Number of elements present in an array are: " +array.length);       //no.of elements in the array are found using length
       scannerObject.close();
   } 
}
