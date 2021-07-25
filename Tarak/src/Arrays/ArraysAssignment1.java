package Arrays;

import java.util.Scanner;

public class ArraysAssignment1 {
    public static void main(String[] args) {
        char originalArray[]={'a','b','c','d','e'};
        
         System.out.println("original array: ");
        for(int i=0;i<originalArray.length;i++){
            System.out.println(originalArray[i]);
        }
        char copiedArray[]=originalArray.clone();
        System.out.println("copied array: ");
        for(int i=0;i<copiedArray.length;i++){
            System.out.println(copiedArray[i]);
        }
    }
}
