package Arrays_Assignment;

import java.util.Arrays;

public class Assignment18 {
    public static void main(String[] args) {
        int[] array1=Assignment1.assignArray();
        Arrays.sort(array1);
        System.out.println("Given Array is");
        Assignment1.displayArray(array1);
        System.out.println("2nd Smallest Number of Array is:" + array1[1]);
        
    }
    
}
