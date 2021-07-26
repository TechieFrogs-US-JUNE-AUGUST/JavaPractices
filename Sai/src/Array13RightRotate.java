import java.util.Scanner;

public class Array13RightRotate {
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6,7,8,9}; // intializing an array
        System.out.println("Orginal Array");
        display(array);  // calling to print an array
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("How many rotations you want : ");
        int rotations = scannerObj.nextInt();  // for number of rotations we want
        for(int index = 0; index < rotations; index++){ //rotations according how many we want
            int rotated , temp ;
            temp = array[array.length-1];  
            for (rotated = array.length-1; rotated > 0 ; rotated--){ 
                 //assign to rotated elements in new index locations
                array[rotated] = array[rotated-1];
            }
            array[0] = temp;
        }
        System.out.println("Array After the Right Rotation"); //
        display(array);
        scannerObj.close();
    }
    static void display(int displayArray[]){ //method for display. we can call same method for both 
        for (int index = 0; index < displayArray.length; index++) {
            System.out.print(displayArray[index] + " "); 
        }
        System.out.println();
    }
}