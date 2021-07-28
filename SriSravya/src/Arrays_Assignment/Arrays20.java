//TO PRINT ODD AND EVEN NUMBERS FROM AN ARRAY
package Arrays_Assignment;

public class Arrays20 {
    public static void main(String[] args) {
      int array[]= new int[]{1,2,3,4,5,6};              //initialsing an array
      System.out.println("Odd Numbers in an array are: ");
      for(int i=0; i<array.length; i++){
          if(array[i]%2 != 0){                     //checks the condition for odd
              System.out.println(array[i]);
          }
      }
      System.out.println("Even Numbers in an array are: ");  
      for(int i=0; i<array.length; i++){
          if(array[i]%2 == 0){                   //checks the condition for even
              System.out.println(array[i]);
          }
       }
    }
}
