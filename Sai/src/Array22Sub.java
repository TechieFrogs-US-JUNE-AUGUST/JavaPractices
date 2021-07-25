public class Array22Sub{
   public static void main(String args[]){
       int matrixA[][] = {{3,2},{3,4}};
       System.out.println("Matrix A : ");
       display(matrixA);
       int matrixB[][] = {{1,1},{2,2}};
       System.out.println("Matrix B : ");
       display(matrixB);
       int rows = matrixA.length;
       int columns = matrixA[0].length;
       int substract[][] = new int[rows][columns];
       for(int row = 0; row < matrixA.length; row++){
          for(int column = 0; column < 2 ; column++){
              substract[row][column] = matrixA[row][column] - matrixB[row][column];
          }
       }
          System.out.println("Subtraction of two matrices: ");
          display(substract); 
    }
          /*for(int row = 0; row < rows; row++){  
              for(int column = 0; column < columns; column++){  
                 System.out.print(substract[row][column] + " ");  
              }  
              System.out.println();*/  
    
          static void display(int displayArray[][]){
            for(int row = 0; row < 2; row++){  
                for(int column = 0; column < 2; column++){  
                   System.out.print(displayArray[row][column] + " ");  
                }  
                System.out.println();
            } 
    }
} 
              
       