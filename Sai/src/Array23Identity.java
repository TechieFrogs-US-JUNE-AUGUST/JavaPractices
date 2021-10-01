import java.util.Scanner;
public class Array23Identity {
    public static void main(String args[]){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(" How many rows you want : ");
        int row = scannerObj.nextInt();
        System.out.println(" How many columns you want : ");
        int column = scannerObj.nextInt();          
        for (int i = 0; i < row ; i++){
            for (int j = 0; j < column ; j++){
                if (i == j)
                    System.out.print( 1+" ");
                else
                    System.out.print( 0+" ");
            }
            System.out.println();
        }
        int array[][] = new int[row][column];
        for (int i = 0; i < row ; i++){
            for (int j = 0; j < column ; j++){
                array[i][j] = scannerObj.nextInt();
            }
        }
        /* to check given matrix is identity matrix
         if(row != column){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else {     
            for(int i = 0; i < row; i++){   
                for(int j = 0; j < column; j++) {   
                    if(i == j && array[i][j] != 1 || i != j && array[i][j] != 0)   
                      System.out.println("Array is not a identity matrix");      
                    else 
                    System.out.println("Given Matrix is a Identity Matrix"); 
                }   
            }*/
        scannerObj.close();
    }
}


