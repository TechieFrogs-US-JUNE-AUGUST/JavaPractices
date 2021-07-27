package Arrays_Assignment;

import java.util.Scanner;

public class Assignment32 {
    public static void main(String[] args) {
        int[][] jArray=new int[3][];
       Scanner scannerObj=new Scanner(System.in);
        jArray[0]=new int[2];
        jArray[1]=new int[3];
        jArray[2]=new int[4];
        System.out.println("Enter First Matrix");
       for(int g=0;g<jArray.length;g++)
       {
           for(int h=0;h<jArray[g].length;h++)
           {
               jArray[g][h]=scannerObj.nextInt();
           }
       }
        int[][] jArray1=new int[2][];
        jArray1[0]=new int[3];
        jArray1[1]=new int[2];
        System.out.println("Enter Second Matrix");
        for(int g1=0;g1<jArray1.length;g1++)
        {
            for(int h1=0;h1<jArray1[g1].length;h1++)
            {
                jArray1[g1][h1]=scannerObj.nextInt();
            }
        }
        System.out.println("First Matrix");
        Assignment23.displayMatrix(jArray);
        System.out.println("Second Matrix");
        Assignment23.displayMatrix(jArray1);
        //int jArrayAdd[][];
        //  if(jArray.length>jArray1.length)
        //  {
              int jArrayAdd[][] = new int[jArray.length][];

        // }
        // else
        //  {
        //     int jArrayAdd[][] = new int[jArray1.length][];
        //  }
        int jj=0;
        if(jArray.length>jArray1.length)
        {
        for(int i=0;i<jArray1.length;i++)
        {
            if(jArray[i].length>jArray1[i].length)
            {
                 jArrayAdd[i]=new int[jArray[i].length];
                 jj=1;
            }
            else
            {
                jArrayAdd[i]=new int[jArray1[i].length];
            }
            for(int j=0;j<jArrayAdd[i].length;j++)
            {
                if(jj==1)
                {
                    if(j<jArray1[i].length)
                    {
                jArrayAdd[i][j]=jArray[i][j]+jArray1[i][j];
                //System.out.print(jArrayAdd[i][j] + " ");
                    }
                else
                {
                jArrayAdd[i][j]=jArray[i][j];
               // System.out.print(jArrayAdd[i][j] + " ");
                }
                }
                else
                {
                    if(j<jArray[i].length)
                    {
                    jArrayAdd[i][j]=jArray[i][j]+jArray1[i][j];
                   // System.out.print(jArrayAdd[i][j] + " ");
                    }
                    else
                    {
                    jArrayAdd[i][j]=jArray1[i][j];
                    //System.out.print(jArrayAdd[i][j] + " ");
                    }

                }
               
            }
            System.out.println();
        }
        for(int ff=jArray1.length;ff<jArray.length;ff++)
        {
            jArrayAdd[ff]=new int[jArray[ff].length];
            for(int bb=0;bb<jArray[ff].length;bb++)
            {
                
                jArrayAdd[ff][bb]=jArray[ff][bb];
            }
        }
        System.out.println("Addition of two Jagged Arrays is : ");
        Assignment23.displayMatrix(jArrayAdd);
        }
        scannerObj.close();
    }   
    
}
