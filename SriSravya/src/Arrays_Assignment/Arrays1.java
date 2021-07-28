//TO COPY ALL ELEMENTS OF ONE ARRAY INTO ANOTHER ARRAY
package Arrays_Assignment;

import java.util.Scanner;

public class Arrays1{
    public static void main(String[] args) {
      //int originalArray[]= {1,2,3,4,5};
        Scanner scannerObject= new Scanner(System.in);        //reading i/p from user using scanners
        System.out.println("Enter the size of an Array");
        int size= scannerObject.nextInt();
        int originalArray[]=new int[size];
        System.out.println("Enter the elements of an Array");
        for(int i=0;i<originalArray.length;i++){
            originalArray[i]=scannerObject.nextInt();
        }
        System.out.println("Original Array elements are: ");
        for(int i=0; i<originalArray.length; i++){            //for loop that prints the original elements
            System.out.println(originalArray[i]);
        }

        int copyArray[]= originalArray.clone();              //1D cloning 
        System.out.println("Copied Array elements are: ");
        for(int i=0; i<copyArray.length; i++){               //for loop that prints the cloned/copied elements
            System.out.println(copyArray[i]);
        }
        scannerObject.close();
    }
}
