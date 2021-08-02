import java.util.Scanner;

public class Assesment1 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        int rows=0;
        do{
            System.out.println("Enter number of Rows to print ");
            while(!scannerObj.hasNextInt())
            {
                System.out.println("This is not a number.Please enter Number");
                scannerObj.next();
            }
            rows=scannerObj.nextInt();
            
        }while(rows<=1);
        
        //int rows=scannerObj.nextInt();// we need to take input from end user
        System.out.println("Printing Patterns :");
        for(int i=0;i<=rows;i++) // for number of rows
        {
            for(int j=rows;j>i;j--) // to print spaces
            {
                System.out.print(" ");
            }
            int temporary=1; //to store new value
            for(int k=1;k<=i;k++) // to store the values
            {
            System.out.print(temporary + " ");
            temporary=temporary*(i-k)/k; 
            }
            System.out.println();

        }
        scannerObj.close();
    }

    
}
