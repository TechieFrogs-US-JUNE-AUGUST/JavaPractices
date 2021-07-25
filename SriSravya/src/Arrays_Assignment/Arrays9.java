//TO PRINT THE LARGEST ELEMENT IN AN ARRAY
package Arrays_Assignment;

public class Arrays9 {
   public static void main(String[] args) {
       int array[]= new int[]{1,8,21,10};
       int max= array[0];                  //initialising max with first element of an array
       for(int i=0; i<array.length; i++){
           if(array[i]> max)                //comparing the elements of an array with max
           max= array[i];                  
       }
       System.out.println("Largest element in the array is: " +max);      //printing the largest element
   } 
}
