//TO PRINT THE ELEMENTS OF AN ARRAY IN REVERSE ORDER
package Arrays_Assignment;

public class Arrays6 {
    public static void main(String[] args) {
        int array[]= new int[]{1,2,3,4,5,6};
        System.out.println("Original array elements are: ");
        for(int i=0; i<array.length; i++){             
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        for(int i=array.length-1; i>=0; i--){           //for loop through the array which prints the elements in reverse order
            System.out.print(array[i]+" ");
        }
    }
}
