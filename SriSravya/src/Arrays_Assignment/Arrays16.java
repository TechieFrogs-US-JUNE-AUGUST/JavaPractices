//TO FIND THE 3RD LARGEST NUMBER IN AN ARRAY
package Arrays_Assignment;

public class Arrays16 {
    public static void main(String[] args) {
        int array[]= new int[]{1,4,6,3,5,2};
        int temp=0;                                 //initialising a temporary variable
        int size= array.length;                    //initialising a variable size which holds array length
        
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(array[i] > array[j]){                    //checks the condition 
                    temp= array[i];                        //sorting the values in ascending order
                    array[i]= array[j];
                    array[j]= temp;
                }
            }
        }
        System.out.println("Third largest number in an array is: " +array[size-3]);       //printing the 3rd largest element of an array
    }
}
