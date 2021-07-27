//TO FIND THE 2ND SMALLEST NUMBER IN ARRAY
package Arrays_Assignment;

public class Arrays18 {
    public static void main(String[] args) {
            int array[]= new int[]{0,1,4,6,3,5,2};
            int temp=0;                                 //initialising a temporary variable
            int size= array.length;                    //initialising a variable size which holds array length
            
            for(int i=0; i<size; i++){
                for(int j=i+1; j<size; j++){
                    if(array[i] < array[j]){                    //checks the condition 
                        temp= array[i];                        //sorting the values in descending order
                        array[i]= array[j];
                        array[j]= temp;
                    }
                }
            }
            System.out.println("Second smallest number in an array is: " +array[size-2]);       //printing the 2nd smallest element in an array
        }
    }
