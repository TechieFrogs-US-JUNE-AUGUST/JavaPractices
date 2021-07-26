//TO PRINT THE SUM OF ALL THE ITEMS IN AN ARRAY
package Arrays_Assignment;

public class Arrays12 {
    public static void main(String[] args) {
      int array[]=new int[]{1,2,3,4,5,6};
      int sum=0;                                       //declaring sum as 0 initially
      for(int i=0; i<array.length; i++){
        sum= sum+array[i];                           //caluculates the sum of elements
        }
        System.out.println("Sum of elements of an Array are: " +sum);
    }
}
