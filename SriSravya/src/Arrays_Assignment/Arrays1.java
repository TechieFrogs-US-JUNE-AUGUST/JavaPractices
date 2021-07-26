//TO COPY ALL ELEMENTS OF ONE ARRAY INTO ANOTHER ARRAY
package Arrays_Assignment;

public class Arrays1{
    public static void main(String[] args) {
        int originalArray[]= {1,2,3,4,5};
        System.out.println("Original Array elements are: ");
        for(int i=0; i<originalArray.length; i++){            //for loop that prints the original elements
            System.out.println(originalArray[i]);
        }

        int copyArray[]= originalArray.clone();              //1D cloning 
        System.out.println("Copied Array elements are: ");
        for(int i=0; i<copyArray.length; i++){               //for loop that prints the cloned/copied elements
            System.out.println(copyArray[i]);
        }
    }
}
