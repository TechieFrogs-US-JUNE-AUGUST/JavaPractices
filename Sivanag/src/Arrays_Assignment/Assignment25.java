//Determine two matrices are equal
package Arrays_Assignment;

public class Assignment25 {
    static Boolean sizeEqualchk(int[][] matrix1,int[][] matrix2)
    {
        if(matrix1.length==matrix2.length)
        {
            for(int k=0;k<matrix1.length;k++)
            {
                if(matrix1[k].length!=matrix2[k].length)
                    return false;
            }
            return true;
        }
        else
            return false;
    }
    static Boolean equalMatrix(int[][] matrix1,int[][] matrix2)
    {
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix1[i].length;j++)
            {
                if(matrix1[i][j]!=matrix2[i][j])
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix1={{1,2},{3,4},{5,6}};
        int[][] matrix2={{1,2},{3,4}};
        if(sizeEqualchk(matrix1, matrix2))
        {
            if(equalMatrix(matrix1, matrix2))
                System.out.println("Given two matrices are equal");
            else
                System.out.println("Given two matrices are not equal");
        }    else
        System.out.println("Given two matrices are not equal");
    }
    
}
