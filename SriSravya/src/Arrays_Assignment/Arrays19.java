//TO REMOVE DUPLICATE ELEMENTS IN AN ARRAY
package Arrays_Assignment;

public class Arrays19 {
    public static void main(String[] args) {
        int array[]= new int[] {1,2,2,3,4,4};           //initialisation
        int length= array.length;

        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(array[i] == array[j]){              //checks the condition and if it finds a duplicate element
                    array[j]= array[length-1];         //that position value is assigned to last 
                    length--;                         //reducing the length
                }
            }
        }
       System.out.println("After removing duplicate elements in an array: ");
       for(int i=0; i<length; i++){
          System.out.println(array[i]);               //printing the values of array without duplicate elements
       }    
    }
}
