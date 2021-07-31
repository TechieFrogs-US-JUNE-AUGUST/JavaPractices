import java.util.Scanner;
public class Array40PrintMulti{
    public static void main(String[] args) {
        Scanner scannerArray = new Scanner(System.in);
        System.out.print("Give number of Rows : ");
        int rows = scannerArray.nextInt();
        System.out.print("Give number of Columns : ");
        int columns = scannerArray.nextInt(); 
        int array[][] = new int[rows][columns];
        System.out.println("give input");
        for(int row = 0; row < rows ; row++ ){
            for(int column = 0 ; column < columns ; column++){
                array[row][column] =  scannerArray.nextInt();
            }
        }
        for(int row = 0; row < rows ; row++ ){
            for(int column = 0 ; column <columns ; column++){
                //System.out.print( row +"x" + column +"=");
                System.out.print(array[row][column] + " ");
            }
        System.out.println();
        scannerArray.close();
        }
    }
}