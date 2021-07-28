package Arrays_Assignment;

import java.util.Arrays;

public class Assignment43 {
    public static void main(String[] args) {
        int[] array1=Assignment1.assignArray();
        if(Arrays.binarySearch(array1, 10)!=-1)
            System.out.println("Element contains in given value");
            else
            System.out.println("Element not contains in given value");

    }
    
}
