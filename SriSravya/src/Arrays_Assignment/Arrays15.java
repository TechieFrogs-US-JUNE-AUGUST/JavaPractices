//TO SORT THE ELEMENTS OF AN ARRAY IN DESCENDING ORDER
package Arrays_Assignment;

public class Arrays15 {
    public static void main(String[] args) {
        int array[]= new int[]{2,3,1,6,4};
        int temp=0;                                  //initilising a temporary variable
        System.out.println("Original Array: ");      //displaying original elements of an array
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] < array[j]){                    //checks the condition for sorting in descending order
                    temp= array[i];                        //sorting the values in descending order
                    array[i]= array[j];
                    array[j]= temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of the array after sorting in descending order are: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");                //displaying the sorted elements
        }
    }
}
