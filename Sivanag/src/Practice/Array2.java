package Practice;

import java.util.Scanner;



public class Array2 {
    static void displayArray(int[][] k,int i,int j)
    {
        if(i<k.length)
        {
            if(j<k[i].length)
            {
                System.out.print(k[i][j]+" ");
                j++;
                displayArray(k, i, j);
                
            }else
           {
            System.out.println();
            j=0;
            displayArray(k, i+1, j);
           }
        }
    }
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.println("Enter Matrix Elements");
        int[][] multiarray=new int[2][3];
        for(int i=0;i<multiarray.length;i++)
        {
            for(int j=0;j<multiarray[i].length;j++)
            {
                multiarray[i][j]=scannerObj.nextInt();
            }

        }
        displayArray(multiarray, 0, 0);
        scannerObj.close();
 
    }
    
}
