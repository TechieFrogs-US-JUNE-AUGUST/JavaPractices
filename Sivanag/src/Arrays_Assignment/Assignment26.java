package Arrays_Assignment;

public class Assignment26 {
    static Boolean isSquareMatrix(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix.length!=matrix[i].length)
            return false;
        }
        return true;
    }
    static Boolean lowTriangular(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(j>i)
                {
                    if(matrix[i][j]!=0)
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[][] matrix1={{1,0,0},{4,5,0},{7,8,9}};
        Assignment23.displayMatrix(matrix1);
        if(isSquareMatrix(matrix1) && lowTriangular(matrix1))
            System.out.println("Given Matrix is a Low Triangular Matrix");
        else
            System.out.println("Given Matrix is not a Low Triangular Matrix");
    }
    
}
