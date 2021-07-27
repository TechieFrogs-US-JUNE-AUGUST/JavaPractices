//Identity Matrix
package Arrays_Assignment;

public class Assignment23 {
    static Boolean IdentityMatrix(int[][] matrix1)
    {
        for(int i=0;i<matrix1.length;i++)
        {
            if(matrix1.length!=matrix1[i].length)
                System.out.println("Given Matrix not Square");
                else
                {     
                         
            for(int j=0;j<matrix1[i].length;j++)
            {
                if(i==j)
                {
                    if(matrix1[i][j]!=1)
                    {
                        return false;
                    }
                }else
                {
                    if(matrix1[i][j]!=0)
                    {
                       return false;
                    }
                }
                }
            
            }
        }
        return true;
    }
    public static void  displayMatrix(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] +" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,0,0},{0,1,0},{0,0,1}};
        displayMatrix(matrix);
        if(IdentityMatrix(matrix))
            System.out.println("Given Matrix is Identity Matrix");
            else
            System.out.println("Given Matrix is not Identity Matix");
    } 
}
