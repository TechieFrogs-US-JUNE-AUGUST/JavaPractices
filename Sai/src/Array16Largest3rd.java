import java.util.Arrays; // we have to import arrays
public class Array16Largest3rd{
    public static void main(String[] args){
    int array[] = {11,22,99,66,55,33,77};
    System.out.print("Given Array : ");
    display(array); //calling display method
    System.out.println();
    System.out.print("Sorted Array : ");
    Arrays.sort(array); // Arrays.sirt(arrayname); gives the sorting in an ascending order
    display(array); //calling display method
    System.out.println();
    System.out.println("The largest number in a give array is : "+ array[array.length-3]);
    // last index is having the largest number, (length-1) is the last index
    } 
    static void display(int displayArray[]){ //method for display. we can call same method for both 
        for (int index = 0; index < displayArray.length; index++) {
            System.out.print(displayArray[index] + " "); 
        }    
    }    
}
