package Arrays_Assignment;

public class Assignment27 {
    static Boolean upperTriangular(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(j<i)
                {
                    if(matrix[i][j]!=0)
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[][] matrix1={{1,0,0},{0,5,1},{0,0,9}};

        Assignment23.displayMatrix(matrix1);
        if(Assignment26.isSquareMatrix(matrix1) && upperTriangular(matrix1))
            System.out.println("Given Matrix is a Upper Triangular Matrix");
        else
            System.out.println("Given Matrix is not a Upper Triangular Matrix");
            int[][] matrix2={{1,0,0},{4,5,0},{7,8,9}};
            Assignment23.displayMatrix(matrix2);
            if(Assignment26.isSquareMatrix(matrix2) && upperTriangular(matrix2))
            System.out.println("Given Matrix is a Upper Triangular Matrix");
        else
            System.out.println("Given Matrix is not a Upper Triangular Matrix");
           
        
    }
    
}
