//TO PRINT THE DUPLICATE ELEMENTS OF AN ARRAY
package Arrays_Assignment;
import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
     //int array[]= new int[] {1,2,3,4,5,2,2,3,4,5};           //initialising an array
       Scanner scannerobj= new Scanner(System.in); 
       System.out.println("Enter size of an array: ");        //we can also initialise using scanners
       int size= scannerobj.nextInt();
       int array[]= new int[size];
       System.out.println("Enter elements of an array: ");
       for(int i=0; i<array.length; i++){
           array[i]= scannerobj.nextInt();
       }

       System.out.println("Duplicate elements of an array are: ");
       for(int i=0; i<array.length; i++){                      //for loop for searching duplicate elements
           for(int j=i+1; j<array.length; j++){
               if(array[i]==array[j])                         
               System.out.println(array[j]);
           }
       }
       scannerobj.close();
    }
}
