package src.Assignment_Wipro;

public class Assignment14 {
    static void displayMatrix(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Number of items Sold is :");
        int items=Assignment2.integerInput();
        System.out.print("Number of Days : ");
        int days=Assignment2.integerInput();
        System.out.println("Enter Profit of each item");
        int dayitems[][]=new int[items][days];
        for(int i=0;i<items;i++)
        {
            for(int j=0;j<days;j++)
            {
                dayitems[i][j]=Assignment2.integerInput();
            }
            
        }
        displayMatrix(dayitems);
        System.out.println("Minimum Profit of Each day is ");
        for(int k=0;k<days;k++)
        {
            int min=dayitems[0][k];
            for(int l=1;l<items;l++)
            {
                if(dayitems[l][k]<min)
                min=dayitems[l][k];
            }
            System.out.print(min +" ");
        }
    }
    
}
