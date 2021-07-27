//TO SORT AN ARRAY 
package Arrays_Assignment;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays21 {
    public static void main(String[] args) {
      //int array[]= new int[]{85,96,21,1,9,64};              //initialisation
        Scanner scannerObject= new Scanner(System.in);        //reading i/p from user using scanners
        System.out.println("Enter the size of an Array");
        int size= scannerObject.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of an Array");
        for(int i=0;i<array.length;i++){
            array[i]=scannerObject.nextInt();
        }

        Arrays.sort(array);                             //sort() method of the Arrays class

        System.out.println("Elements after sorting are: ");
        for(int i=0; i<array.length; i++){
            System.err.println(array[i]);               //printing the sorted values of an array
        }
        scannerObject.close();
     }  
   }
