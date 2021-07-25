public class Array22Sub{
   public static void main(String args[]){
       int matrixA[][] = {{3,2},{3,4}};
       System.out.println("Matrix A : ");
       display(matrixA);// calling method for printing
       int matrixB[][] = {{1,1},{2,2}};
       System.out.println("Matrix B : ");
       display(matrixB);// calling method for printing
       int rows = matrixA.length;
       int columns = matrixA[0].length;
       int substract[][] = new int[rows][columns];//array for substract
       for(int row = 0; row < matrixA.length; row++){ //loop for to do substraction
          for(int column = 0; column < 2 ; column++){
              substract[row][column] = matrixA[row][column] - matrixB[row][column];
          }
       }
          System.out.println("Subtraction of two matrices: ");
          display(substract); // calling method for printing
    }
          /*for(int row = 0; row < rows; row++){  
              for(int column = 0; column < columns; column++){  
                 System.out.print(substract[row][column] + " ");  
              }  
              System.out.println();*/  
    
          static void display(int displayArray[][]){// creating method  for display an array
            for(int row = 0; row < 2; row++){  
                for(int column = 0; column < 2; column++){  
                   System.out.print(displayArray[row][column] + " ");  
                }  
                System.out.println();
            } 
    }
} 
              
       