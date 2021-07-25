import java.util.*;
public class Array14Sort {
    public static void main(String[] args){
        int array[] = {34,5,6,7,8,3,2,2,2,2,2,245,5,6};
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
