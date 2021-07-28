//TO FIND THE SUM OF EACH ROW AND EACH COLUMN OF A MATRIX
package Arrays_Assignment;

public class Arrays30 {
    public static void main(String[] args) {
        int a[][]= new int[][]{{1,2,3},{4,5,6}};            //initialisation
        int rows= a.length;
        int columns= a[0].length;

        int sumRows=0;                                     //using a counter sumRows
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                sumRows= sumRows + a[i][j];               //through every iteration it adds each element of each row
            }
            System.out.println("Sum of " +(i+1)+ " row: " + sumRows);           //prints the each row sum
        }
        int sumColumns=0;                                 //using a counter sumColumns
        for(int i=0; i<columns; i++){
            for(int j=0; j<rows; j++){
                sumColumns= sumColumns + a[j][i];        //through every iteration it adds each element of each column
            }
            System.out.println("Sum of " +(i+1)+ " column: " + sumColumns);       //prints the each column sum
        }
    }
}
