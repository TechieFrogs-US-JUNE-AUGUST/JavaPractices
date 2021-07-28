public class Array26LowerTriangle{    
    public static void main(String[] args) { 
        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9} };  
        int rows = a.length;    
        int columns = a[0].length;    
        if(rows != columns)   
              System.out.println("Matrix should be a square matrix");   
        else{    
            System.out.println("Lower triangular matrix: "); // for lower triangle 
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    if(i > j)
                        System.out.print("");    
                    else    
                        System.out.print(a[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }    
    }    
} 