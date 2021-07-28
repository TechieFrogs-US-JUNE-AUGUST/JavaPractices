import java.util.Arrays; // we have to import arrays
public class Array10Smallest {
    public static void main(String[] args){
    int array[] = {11,22,99,66,55,33,77,6};
    System.out.print("Given Array : ");
    display(array); //calling display method
    System.out.println();
    System.out.print("Sorted Array : ");
    Arrays.sort(array); // Arrays.sirt(arrayname); gives the sorting in an ascending order
    display(array); //calling display method
    System.out.println();
    System.out.println("The smallest number in a give array is : "+ array[0]);
    // 1st index location is having the smallest number after the sorting
    } 
    static void display(int displayArray[]){ //method for display. we can call same method for both 
        for (int index = 0; index < displayArray.length; index++) {
            System.out.print(displayArray[index] + " "); 
        }    
    }  
}
