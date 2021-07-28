import java.util.Scanner;
public class Array30SumRowColumn {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println(" rows");
        int rows = scannerObj.nextInt();
        System.out.println("columns");
        int columns = scannerObj.nextInt();        
        System.out.println("Enter array elements : ");          
        int multiArray[][]=new int[rows][columns];           
         for(int i=0; i<rows;i++){            
             for(int j=0; j<columns;j++)
             {
                 multiArray[i][j]=scannerObj.nextInt();
             }
          }
          for(int i = 0; i < rows ; i++){
              int sumRow =0 ;
              for(int j = 0; j < columns ; j++){
                sumRow = sumRow+ multiArray[i][j];
                //System.out.println(sumColumn);
              }
              System.out.println("Sum of Rows : " + sumRow);
          }
          for(int i = 0; i < columns; i++){  
              int sumColumn = 0;   
            for(int j = 0; j < rows; j++){    
                sumColumn = sumColumn + multiArray[j][i];    
            }    
            System.out.println("Sum of Columns : " + sumColumn);    
        }  
        scannerObj.close();  
    }    
}

