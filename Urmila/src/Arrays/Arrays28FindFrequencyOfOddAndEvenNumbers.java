package Arrays;
import java.util.Scanner;
public class Arrays28FindFrequencyOfOddAndEvenNumbers 
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);      //scanner used to read inputs     
        int rows, columns;
        System.out.println("Enter the size of rows: ");
        rows= scanner.nextInt();
        System.out.println("Enter the size of columns: ");
        columns= scanner.nextInt();

        int array[][]= new int[rows][columns];         //Initializing an array

        System.out.println("Enter the elements: ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                array[i][j]= scanner.nextInt();
            }
        }
        
        int count=0, count1=0;      //Taking 2 counters for even and odd
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                if(array[i][j]%2 == 0)      //checks the condition for even and odd
                count++;                   // count for even number
                else
                count1++;                  // count for odd number
            }
        }
        System.out.println("Frequency of Even Numbers: " +count);
        System.out.println("Frequency of Odd Numbers: "  +count1);
        scanner.close(); 
    }
    
}
