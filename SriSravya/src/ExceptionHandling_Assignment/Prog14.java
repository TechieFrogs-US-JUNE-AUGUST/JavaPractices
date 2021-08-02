//TO HANDLE ARRAY INDEXOUTOFBOUND EXCEPTION
package ExceptionHandling_Assignment;

public class Prog14 {
    public static void main(String[] args) {
        int array[]= {10, 20, 30};
        try {
           // array[5]= 40;
           for(int i=5; i>=0; i--){                                    //ArrayIndexOutOfBoundsException is caused
               System.out.println("My array value is: " +array[i]);
           }
        } catch (ArrayIndexOutOfBoundsException aie) {
            array[2]= 40;                                             //it is handled here
            System.out.println("My array value is: " +array[2]);
            System.out.println("In Array Index Out of Bound Exception" +aie);
        }
    }
}
