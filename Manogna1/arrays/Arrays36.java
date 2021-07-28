package arrays;

public class Arrays36 {
    public static void main(String[] args) {
        int array1[][]={{10,11,12},{7,8,6},{7,8,9}};
        int array2[][]={{1,2,3},{6,5,4},{3,2,1}};
        int sum[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum[i][j]=array1[i][j]+array2[i][j];
            }
        }
        System.out.println("Sum of Two Matrices:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(sum[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
}
