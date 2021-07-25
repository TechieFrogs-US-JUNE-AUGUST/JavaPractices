//TO PRINT THE ELEMENTS OF AN ARRAY PRESENT ON ODD POSITION
package Arrays_Assignment;

public class Arrays8 {
    public static void main(String[] args) {
        int array[]= new int[]{1,2,3,4,5,6};
        System.out.println("Elements of an array present in even position are: ");
        for(int i=0; i<array.length; i=i+2){           //for loop through the array by incrementing i value by 2
            System.out.println(array[i]);              //i value starts with 0 because the first odd position is at 0th index
        }
    }
}
