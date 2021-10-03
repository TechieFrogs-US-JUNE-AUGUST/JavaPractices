import java.util.Arrays;
import java.util.Scanner;

public class CodingS10 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Give the row size of an array : ");
        int row = scannerObj.nextInt();
        System.out.print("Give the column size of an array : ");
        int column = scannerObj.nextInt();
        int array[][] = new int[row][column];
        System.out.println("Enter the array values");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                array[i][j] = scannerObj.nextInt();
            }
        }
        scannerObj.close();
        System.out.println("Orginal Array : ");
        displayArray(array);
        for(int i = 0; i < array.length; i++){
            Arrays.sort(array[i]);
        }
        System.out.println("After sorting all the rows in an ascending order : ");
        displayArray(array);
    }
    static void displayArray(int display[][]){
        for(int i = 0; i < display.length ; i++){
            for(int j = 0; j < display.length ; j ++){
                System.out.print(display[i][j]+" ");
            }
            System.out.println();
        }
    }
}
