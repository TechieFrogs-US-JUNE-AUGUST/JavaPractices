import java.util.Scanner;

public class Array34Average{
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter number of Rows : ");
        int row = scannerObj.nextInt();
        System.out.println("Enter number of Columns : ");
        int column = scannerObj.nextInt();
        int Array[][] = new int[row][column];
        System.out.println("Give input");
        for(int rows = 0; rows < row ; rows++ ){
            for(int columns = 0 ; columns < column ; columns++)
                Array[rows][columns] =  scannerObj.nextInt();
        }
        int sum = 0 ;
        for(int rows = 0; rows < row ; rows++ ){
            for(int columns = 0 ; columns < column ; columns++){
                sum = sum + Array[rows][columns] ;
            }
        }
        System.out.println(sum);
        int average;
        average = sum/Array.length;
        System.out.println("Average of an Array is : "+ average);
        scannerObj.close();
    }
    
}
