import java.util.Scanner;
public class Array28FrquencyOddEven { 
    public static void main(String[] args) {    
        Scanner scannerArray = new Scanner(System.in);
        System.out.print("Give number of Rows : ");
        int rows = scannerArray.nextInt();
        System.out.print("Give number of Columns : ");
        int columns = scannerArray.nextInt(); 
        int array[][] = new int[rows][columns];
        System.out.println("Give the Matrix input : ");
        for(int row = 0; row < rows ; row++ ){
            for(int column = 0 ; column < columns ; column++)
                array[row][column] =  scannerArray.nextInt();
        }  
        int  countOdd = 0, countEven = 0; 
        for(int i = 0; i < rows; i++){    
            for(int j = 0; j < columns; j++){    
              if(array[i][j] % 2 == 0)    
                countEven++;    
              else    
                countOdd++;    
            }    
        }    
            
        System.out.println("Frequency of odd numbers: " + countOdd);    
        System.out.println("Frequency of even numbers: " + countEven);   
        scannerArray.close(); 
    }    
}    
    