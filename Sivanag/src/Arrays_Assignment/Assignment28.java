package Arrays_Assignment;

public class Assignment28 {
    static void oddEveNumbers(int[][] matrix)
    {
        int odd[] =new int[matrix.length*matrix[0].length];
        int even[] =new int[matrix.length*matrix[0].length];
        int k=0,k1=0;
        int oddcnt=0,evencnt=0;
        for(int i=0;i<matrix.length;i++)
        {

            for (int is : matrix[i]) {
                //System.out.println(is);
                if((is%2)!=0)
                {
                    odd[k]=is;
                    k++;
                    oddcnt++;
                }
                else{
                    even[k1]=is;
                    k1++;
                    evencnt++;
                }
                
            }
        }
        System.out.println("Frequency of Even Numbers in Given Matrix is :" + evencnt);
        System.out.println("Even Numbers in Given Matrix are:");
        for (int j : even) {
            if(j!=0)
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Frequency of Odd Numbers in Given Matrix is :" + oddcnt);
        System.out.println("Odd Numbers in Given Matrix are:");
        for (int b : odd) {
            if(b!=0)
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        oddEveNumbers(matrix);

    }
  


}
