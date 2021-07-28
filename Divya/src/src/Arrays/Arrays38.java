package Arrays;

public class Arrays38 {

    public static void main(String[] args) {
        int[][] matrix1 = { {1,2,3 },{4,5,6 },{1,2,3} };            // creating the first matrix using arrays
        int[][] matrix2 = { {1,1,1}, {2,2,2}, {3,3,3} };    // creating the second matrix using two dimension array
        int rows1 = matrix1.length;                          // Matrix 1 rows and columns length
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;                              // Matrix 2 rows and columns length
        int columns2 = matrix2[1].length;

        int[][] result = new int[rows1][columns2];            // output array for storing the multiplication result

        // Calling a function for matrix multiplication core logic
        doMatricMultiplication(matrix1, matrix2, rows1, columns1, columns2, result);

        // printing the result
        //
        doPrintResultMatric(result);

    }
    private static void doMatricMultiplication(int[][] matrix1, int[][] matrix2, int rows1, int columns1, int columns2,
                                               int[][] result) { for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

    }
    private static void doPrintResultMatric(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[1].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}