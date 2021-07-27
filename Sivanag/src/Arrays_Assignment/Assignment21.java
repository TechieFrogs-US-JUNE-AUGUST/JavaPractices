package Arrays_Assignment;

import java.util.Arrays;

public class Assignment21 {
    public static void main(String[] args) {
        String[] string= {"hai","sivanag","Nag","Anu","Hammsi","Nihal"};
        System.out.println("Given Array");
        Assignment1.displayArray(string);
        Arrays.sort(string);
        System.out.println("Sorted Array");
        Assignment1.displayArray(string);
    }
    
}
