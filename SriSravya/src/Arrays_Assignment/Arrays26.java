//TO DISPLAY THE LOWER TRIANGULAR MATRIX
//lower triangular matrix means all the elements above the diagonal need to be zero
package Arrays_Assignment;

public class Arrays26 {
    public static void main(String[] args) {
        int rows,columns;
        int a[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rows= a.length;
        columns= a[0].length;
        if(rows!=columns){                                          //if condition checks if rows and columns are not equal
            System.out.println("Matrix should be a square matrix");
        }
        else{                                                    //performs operation to convert given matrix into lowertriangular matrix
            System.out.println("Lower Triangular Matrix: ");
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    if(j>i)                                     //checks the condition with ith and jth index positions
                    System.out.print("0 ");                  //if the condition is true it prints the value as 0 above the diagonal
                    else
                    System.out.print(a[i][j]+" ");         //else it prints the matrix values
                }
                System.out.println();
            }
        }
    }
}
