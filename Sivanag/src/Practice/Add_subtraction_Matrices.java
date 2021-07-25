package Practice;

public class Add_subtraction_Matrices {
    static void addMatrix1(int[][] ar1,int[][] ar2)
    {
        int[][] addmat=new int[ar1.length][ar2.length];
        for(int i=0;i<ar1.length;i++)
        {
          
            for(int j=0;j<ar1[i].length;j++)
            {
               
                addmat[i][j]=ar1[i][j]+ar2[i][j];
            }
            
        }
        System.out.println("First Matrix : ");
        ArrayClone.displayArray(ar1);
        System.out.println("SEcond Matrix : ");
        ArrayClone.displayArray(ar2);
        System.out.println("Addition of two Matrix : ");
        ArrayClone.displayArray(addmat);
    }
    static void subMatrix1(int[][] ar1,int[][] ar2)
    {
        int[][] submat=new int[ar1.length][ar2.length];
        for(int i=0;i<ar1.length;i++)
        {
          
            for(int j=0;j<ar1[i].length;j++)
            {
               
                submat[i][j]=ar1[i][j]-ar2[i][j];
            }
            
        }
        System.out.println("First Matrix : ");
        ArrayClone.displayArray(ar1);
        System.out.println("SEcond Matrix : ");
        ArrayClone.displayArray(ar2);
        System.out.println("Subtraction of two Matrix : ");
        ArrayClone.displayArray(submat);
    }
    public static void main(String[] args) {
        int[][] multiArray1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] multiArray2={{1,2,3},{4,5,6},{7,8,9}};
        addMatrix1(multiArray1, multiArray2);
        subMatrix1(multiArray1, multiArray2);
    }

    
    
}
