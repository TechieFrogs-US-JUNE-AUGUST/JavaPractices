//TO CALCULATE AVERAGE USING ARRAYS
package Arrays_Assignment;
import java.util.Scanner;

public class Arrays34 {
    public static void main(String[] args) {
      Scanner scannerObject= new Scanner(System.in);         //reading i/p from user using scanners
      System.out.println("Enter size of the array: "); 
      int size= scannerObject.nextInt();
      int array[]= new int[size];                           //initialisation
      System.out.println("Enter elements of array");
      for(int i=0; i<array.length; i++){
          array[i]= scannerObject.nextInt();
      } 

      int length= array.length;                       //for array length
      int sum=0;
      for(int i=0; i<array.length; i++){              //iterates through the array elements
          sum= sum + array[i];                       //gives the sum of all the values in an array
      }
      double average = sum/length;                   //calculates the avg
      System.out.println("Average of the array is: " +average);
      scannerObject.close();  
     }
}
