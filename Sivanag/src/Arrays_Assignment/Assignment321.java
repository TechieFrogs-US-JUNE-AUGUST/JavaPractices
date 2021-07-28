package Arrays_Assignment;

public class Assignment321 {
    public static void main(String[] args) {
        System.out.println("Enter First Matrix");
        int[][] matrix=Assignment33.createAssignJaggedArray();
        System.out.println("Assign Values to First Matrix");
        Assignment33.assignMatrix(matrix);
        System.out.println("Enter Second Matrix");
        int[][] matrix1=Assignment33.createAssignJaggedArray();
        System.out.println("Assign Values to Second Matrix");
        Assignment33.assignMatrix(matrix1);
        int[][] addMatrix;
        if(matrix.length>matrix1.length)
            addMatrix=new int[matrix.length][];
        else
            addMatrix=new int[matrix1.length][];
        for(int i=0;i<addMatrix.length;i++)
        {
            
        }
    }

    
}
