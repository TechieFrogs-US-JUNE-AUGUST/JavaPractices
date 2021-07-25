//TO RIGHT ROTATE THE ELEMENTS OF AN ARRAY
package Arrays_Assignment;

public class Arrays13 {
    public static void main(String[] args) {
        int array[]= new int[]{1,2,3,4,5,6};
        int n=3;
        System.out.println("Original Array elements are: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

            for(int i=0; i<n; i++){         //rotating the given array by n times towards right
              int j, last;
              last= array[array.length-1];                     //stores the last element of array
              for(j=array.length-1; j>0; j--){
                  array[j]= array[j-1];               //shifting the elements of array by one
              }
              array[0]= last;                       //last element of array will be added to the start of array
            }
            System.out.println();

            System.out.println("Array after right rotation: ");
            for(int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
            }   
    }
}
