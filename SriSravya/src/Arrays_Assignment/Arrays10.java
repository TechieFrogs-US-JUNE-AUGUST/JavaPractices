//TO PRINT THE SMALLEST ELEMENT IN AN ARRAY
package Arrays_Assignment;

public class Arrays10 {
    public static void main(String[] args) {
        int array[]= new int[]{1,8,21,10};
        int min= array[0];              //initialising min with first element of an array
        for(int i=0; i<array.length; i++){
            if(array[i]< min)                //comparing the elements of an array with min
            min= array[i];                  
        }
        System.out.println("Largest element in the array is: " +min);      //printing the smallest element 
    }
}
