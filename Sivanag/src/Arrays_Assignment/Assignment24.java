package Arrays_Assignment;

public class Assignment24 {
    static int numofelementsMatrix(int[][] matrix)
    {
        int cnt=0;
       for (int[] is : matrix) 
            cnt=cnt+is.length;
        return cnt;
    }
    static int countZerosinMatrix(int[][] matrix)
    {
        int cnt=0;
        for (int[] is : matrix) {
           for(int j=0;j<is.length;j++)
           {
            if(is[j]==0)
            cnt++;
           }  
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[][] matrix={{0,1,1},{1,0,0},{5,6,1}};
        System.out.println("Number of elements in a Matrix :" +numofelementsMatrix(matrix) );
        System.out.println("Number of Zeros in a Matric:" +countZerosinMatrix(matrix));
        if(countZerosinMatrix(matrix)>=(numofelementsMatrix(matrix)/2))
            System.out.println("Given matrix is a Sparse Matrix");
        else
        System.out.println("Given matrix is not a Sparse Matrix");
        
    }
    
}
