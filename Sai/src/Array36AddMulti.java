import java.util.Scanner;
public class Array36AddMulti {
    public static void main(String[] args) {
        Scanner scannerArray = new Scanner(System.in);
        int array1[][] = new int[3][3];
        int rows = array1.length;
        int columns = array1[0].length;
        System.out.println("Give Matrix 1 values");
        for(int row = 0; row < 3 ; row++ ){
            for(int column = 0 ; column <3 ; column++){
                array1[row][column] =  scannerArray.nextInt();
            }
        }  
        int array2[][] = new int[3][3];
        System.out.println("Give Matrix 2 values");
        for(int row = 0; row < rows ; row++ ){
            for(int column = 0 ; column < columns ; column++){
                array2[row][column] =  scannerArray.nextInt();
            }
        }  
        int addArray[][] = new int[rows][columns];//array for addition
        for(int row = 0; row < rows; row++){ //loop for to do adding both arrays
           for(int column = 0; column < columns; column++){
               addArray[row][column] = array1[row][column] + array2[row][column];
           }
        }
        System.out.println("Addition of Array1 and Array2 is : ");
        for(int i =0 ; i < rows ;i++){
            for(int j =0 ; j < columns ; j++){
                System.out.print(addArray[i][j]+" ");
            }
        System.out.println();
        }
        scannerArray.close();
    }    
}
