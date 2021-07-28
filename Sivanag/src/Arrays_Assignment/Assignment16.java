package Arrays_Assignment;

import java.util.Arrays;

public class Assignment16 {
    public static void main(String[] args) {
        int[] array1=Assignment1.assignArray();
        Arrays.sort(array1);
        System.out.println("Given Array is");
        Assignment1.displayArray(array1);
        System.out.println("3rd Largest Number of Array is:" + array1[array1.length-3]);
        
    }
    
}
