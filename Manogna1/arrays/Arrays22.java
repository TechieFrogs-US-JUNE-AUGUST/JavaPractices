package arrays;

public class Arrays22 {
    public static void main(String[] args) {
        int array1[][]={{10,11,12},{7,8,6},{7,8,9}};
        int array2[][]={{1,2,3},{6,5,4},{3,2,1}};
        int difference[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                difference[i][j]=array1[i][j]-array2[i][j];
            }
        }
        System.out.println("Substraction of Two Matrices:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(difference[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
}
