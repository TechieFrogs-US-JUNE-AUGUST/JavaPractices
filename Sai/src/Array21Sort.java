import java.util.*;
public class Array21Sort {
    public static void main(String[] args){
        int array[] = {34,5,6,7,11,34,23,16,3,4,100,0};
        System.out.print("Before Sorting : ");
        display(array);
        Arrays.sort(array);
        System.out.println();
        System.out.print("After Sorting : ");
        display(array);
    }
    static void display(int displayArray[]){ //method for display. we can call same method for both 
        for (int index = 0; index < displayArray.length; index++) {
            System.out.print(displayArray[index] + " "); 
        }            
    }
}

