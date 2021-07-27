package Arrays_Assignment;

public class Assignment29 {
    static void productMatrix(int[][] matrix1,int[][] matrix2)
    {
        int[][] product= new int[matrix1.length][matrix2[0].length];
        if(matrix1[0].length!=matrix2.length)
        {
            System.out.println("Matrix canot be mutiplied");
        }
        else
        {
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix2[0].length;j++)
            {
                for(int k=0;k<matrix2.length;k++)
                {
                product[i][j]=product[i][j]+(matrix1[i][k]*matrix2[k][j]) ;
                }

            }
        }
        }
        Assignment23.displayMatrix(product);
    }
   public static void main(String[] args) {
       int[][] matrix1={{1,2,3},{4,5,6},{7,8,9}};
       int[][] matrix2={{1,2,3},{4,5,6},{7,8,9}};
       productMatrix(matrix1, matrix2);
   }
}
