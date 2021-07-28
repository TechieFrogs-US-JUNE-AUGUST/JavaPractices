//TO PRINT THE LARGEST ELEMENT IN AN ARRAY
package Arrays_Assignment;

import java.util.Scanner;

public class Arrays9 {
   public static void main(String[] args) {
      //int array[]= new int[]{1,8,21,10};                   //initialisation
       Scanner scannerObject= new Scanner(System.in);        //reading i/p from user using scanners
        System.out.println("Enter the size of an Array");
        int size= scannerObject.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of an Array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }
       int max= array[0];                  //initialising max with first element of an array
       for(int i=0; i<array.length; i++){
           if(array[i]> max)                //comparing the elements of an array with max
           max= array[i];                  
       }
       System.out.println("Largest element in the array is: " +max);      //printing the largest element
       scannerObject.close();
   } 
}
