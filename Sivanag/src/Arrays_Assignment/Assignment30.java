package Arrays_Assignment;

public class Assignment30 {
    static void sumRow(int[][] matrix)
    {
        int sum;
        for(int i=0;i<matrix.length;i++)
        {
            sum=0;
            for (int is : matrix[i]) {
                sum=sum+is;
                
            }
            System.out.println("Sum of " + (i+1) + " Row: " +sum);
        }

    }
    static void sumColumn(int[][] matrix)
    {
        int sum;
        for(int i=0;i<matrix.length;i++)
        {
            sum=0;
          for(int j=0;j<matrix[i].length;j++)
          {
           
                sum=sum+matrix[j][i];
            

          }
            System.out.println("Sum of " + (i+1) + " Column: " +sum);
        }

    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Assignment23.displayMatrix(matrix);
        sumRow(matrix);
        sumColumn(matrix);

    }
    
}
