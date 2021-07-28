//TO CONCATENATE TWO ARRAYS
package Arrays_Assignment;

//import java.util.Arrays;

public class Arrays41 {
   public static void main(String[] args) {
       int array1[]= {1,2,3,4,5};                                //source array
       int array2[]= {6,7,8,9,0};                                //destination array
       int result[]= new int[array1.length + array2.length];     //result array of size first array and second array

       System.arraycopy(array1, 0, result, 0, array1.length);          //copying array1 values to result array
       System.arraycopy(array2, 0, result, array1.length, array2.length);    //copying array2 values to result array
     //System.out.println(Arrays.toString(result));                          //prints the result array
       for(int i=0; i<result.length; i++){
           System.out.print(result[i]+" ");
       }
       System.out.println();
   } 
}
