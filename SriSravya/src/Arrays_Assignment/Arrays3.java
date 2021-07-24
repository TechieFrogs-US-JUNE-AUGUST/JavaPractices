//TO LEFT ROTATE THE ELEMENTS OF AN ARRAY
package Arrays_Assignment;

public class Arrays3 {
    public static void main(String[] args) {
        int array[]= new int[]{1,2,3,4,5,6};
        int n=3;
        System.out.println("Original Array elements are: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

            for(int i=0; i<n; i++){         //rotating the given array by n times towards left
              int j, first;
              first= array[0];                     //stores the first element of array
              for(j=0; j<array.length-1; j++){
                  array[j]= array[j+1];               //shifting the elements of array by one
              }
              array[j]= first;                       //first element of array will be added to the end
            }
            System.out.println();

            System.out.println("Array after left rotation: ");
            for(int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
            }
        }
    }

