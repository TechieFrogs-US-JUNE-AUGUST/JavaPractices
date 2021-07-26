//TO FIND THE 2ND LARGEST NUMBER IN ARRAY
package Arrays_Assignment;

public class Arrays17 {
    public static void main(String[] args) {
        int array[]= new int[]{1,4,6,7,5,2};
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
        System.out.println("Second largest number in an array is: " +array[size-2]);       //printing the 2nd largest element of an array
    }
}
