package Arrays_Assignment;

import java.util.Arrays;

public class Arrays40 {
    public static void main(String[] args) {
        int array[]= {1,2,3,4,5};                       //initialisation
        for(int i=0; i<array.length; i++){              //using for loop prints the array elements
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));         //returns string representation of the array
    }
}
