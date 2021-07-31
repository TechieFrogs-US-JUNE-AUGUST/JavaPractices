import java.util.Scanner;
public class Array38Multi{
    public static void main(String[] args) {    
        //int row1, col1, row2, col2;    
        Scanner scannerArray = new Scanner(System.in);
        System.out.print("Give number of Rows : "); // getting 1st matrix details and elements
        int rows1 = scannerArray.nextInt();
        System.out.print("Give number of Columns : ");
        int columns1 = scannerArray.nextInt(); 
        int array1[][] = new int[rows1][columns1];
        System.out.println("Give the 1st Matrix input : ");
        for(int row = 0; row < rows1 ; row++ ){
            for(int column = 0 ; column < columns1 ; column++)
                array1[row][column] =  scannerArray.nextInt();
        } 
        System.out.print("Give number of Rows : "); // getting 2nd matrix details and elements
        int rows2 = scannerArray.nextInt();
        System.out.print("Give number of Columns : ");
        int columns2 = scannerArray.nextInt();  
        int array2[][] = new int[rows2][columns2];
        System.out.println("Give the 2nd Matrix input : ");
        for(int row = 0; row < rows2 ; row++ ){
            for(int column = 0 ; column < columns2 ; column++)
                array2[row][column] =  scannerArray.nextInt();
        }   
            
        if(columns1 != rows2)
            System.out.println("Matrices cannot be multiplied");       
        else{  
            int production[][] = new int[array1.length][array2[0].length];      
            for(int i = 0; i < array1.length; i++){    
                for(int j = 0; j < array2[0].length; j++){    
                   for(int k = 0; k < array2.length; k++)
                      production[i][j] = production[i][j] + array1[i][k] * array2[k][j];        
                }    
            } 
            System.out.println("Production of 2 Matrices : "); 
            for(int row= 0 ; row < production.length ; row++){
                for(int column = 0 ; column < production[0].length ; column++)
                    System.out.print(production[row][column] + " ");
                System.out.println();
        }
        }   
        scannerArray.close();
    }
}