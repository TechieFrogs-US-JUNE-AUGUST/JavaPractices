//ADD TWO MATRICES -- JAGGED ARRAY
package Arrays_Assignment;

public class Arrays32 {
   public static void main(String[] args) {
       int array1[][]= new int[2][];                //initialisation
       int array2[][]= new int[2][];
       array1[0]= new int[]{1,2};                  //decaring array1 elements using jagged array..i.e, 1st row contains 2 columns
       array1[1]= new int[]{1,2,3};
       array2[0]= new int[]{4,5};     
       array2[1]= new int[]{4,5,6};               //decaring array2 elements using jagged array..i.e, 2nd row contains 3 columns

       int jaggedAdd[][]= new int[2][];           //for storing the added values we used jaggedAdd variable
       jaggedAdd[0]= new int[2];
       jaggedAdd[1]= new int[3];
       
       //for displaying array1 elements
       for(int i=0; i<array1.length; i++){
        for(int j=0; j<array1[i].length; j++){
            System.out.print(array1[i][j]+" ");
        }
        System.out.println();
    }
       //for displaying array2 elements
       for(int i=0; i<array2.length; i++){
            for(int j=0; j<array2[i].length; j++){
                System.out.print(array2[i][j]+" ");
            }
        }  
        System.out.println();

        //to add the elements of a 2D matrix the no.of rows and columns should be equal, so we cannot add them using jagged array
    }
} 
