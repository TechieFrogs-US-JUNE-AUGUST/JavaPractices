package Arrays_Assignment;

public class Assignment31 {
    int[][] matrix1={{1,2,3},{4,5,6},{7,8,9}};
    int[][] transMatrix =new int[matrix1.length][matrix1[0].length];
    for(int i=0;i<matrix1.length;i++)
    {
        for(int j=0;j<matrix1[i].length;j++)
        {
            transMatrix[i][j]=matrix1[j][i];
            System.out.print(transMatrix[i][j] + " ");
        }
        System.out.println();
    }

    }  
    
}
