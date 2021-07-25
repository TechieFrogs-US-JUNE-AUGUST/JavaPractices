import java.util.Arrays;
public class Array15Descending{
    public static void main(String[] args){
        int array[] = {34,5,6,7,8,3,2,2,2,2,2,245,5,6};
        System.out.print("Before Sorting : ");
        display(array);
        Arrays.sort(array);
        System.out.println();
        System.out.print("Array in Descending: ");
        for(int i = array.length-1; i >= 0; i--)
            System.out.print(array[i] + "  ");
        
    }
    static void display(int displayArray[]){ //method for display. we can call same method for both 
        for (int index = 0; index < displayArray.length; index++) {
            System.out.print(displayArray[index] + " "); 
        }            
    }
}
