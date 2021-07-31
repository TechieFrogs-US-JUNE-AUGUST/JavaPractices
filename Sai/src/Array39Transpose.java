import java.util.Scanner;
public class Array39Transpose{
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(" Enter number of Rows : ");
        int row = scannerObj.nextInt();
        System.out.println(" Enter number of Columns : ");
        int column = scannerObj.nextInt();
        int array[][] = new int[row][column];
        int temp[][] = new int[row][column];
        System.out.println("Give the Matrix input");
        for( row = 0; row < array.length ; row++ ){
            for( column = 0 ; column < array[0].length; column++)
                array[row][column] =  scannerObj.nextInt();
        } 
        for (row = 0 ; row < array.length ; row++){
            //int temp[][] = new int[row][column];
            for(column = 0 ; column < array[0].length ; column++){
                temp[row][column] = array[column][row];
            }
        }
        System.out.println("Transposed Matrix of orginal matrix");
        for(row = 0 ; row < temp.length ; row++){
            for(column = 0 ; column < temp[0].length ; column++)
                System.out.print(temp[row][column] + " ");
            System.out.println();
        }   
    }
}
