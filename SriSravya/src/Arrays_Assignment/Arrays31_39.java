//TO FIND THE TRANSPOSE OF A GIVEN MATRIX
//Transpose means converting rows into columns
package Arrays_Assignment;

public class Arrays31_39 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int rows= a.length;
        int columns= a[0].length;

        int t[][]= new int[columns][rows];      //declaring an array t with reverse dimensions

        for(int i=0; i<columns; i++){           //calculating tranpose of matrix
            for(int j=0; j<rows; j++){
                t[i][j] = a[j][i];               //converts the row of original matrix into column of transposed matrix
            }
        }
        System.out.println("Transpose of the matrix is: ");
        for(int i=0; i<columns; i++){
        for(int j=0; j<rows; j++){
            System.out.print(t[i][j]+" ");
        }
        System.out.println();
       }
    }
}
