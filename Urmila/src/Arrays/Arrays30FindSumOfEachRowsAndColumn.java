package Arrays;

public class Arrays30FindSumOfEachRowsAndColumn 
{
    public static void main(String[] args)
    {
        int array[][]= new int[][]{{4,2,6},{9,5,7}};//Initializing an array elements
        int rows= array.length;
        int columns= array[0].length;

        int sumrows=0;       //loop used to count sum of rows
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                sumrows= sumrows + array[i][j];//iterates by it adds each element of each row
            }
            System.out.println("Sum of " +(i+1)+ " row: " + sumrows);                }
        int sumcolumns=0;    //loop used to count sum of columnns
        for(int i=0; i<columns; i++)
        {
            for(int j=0; j<rows; j++)
            {
                sumcolumns= sumcolumns + array[j][i]; //iteratesby it adds each element of each column
            }
            System.out.println("Sum of " +(i+1)+ " column: " + sumcolumns);    
        }
    }
    
}
