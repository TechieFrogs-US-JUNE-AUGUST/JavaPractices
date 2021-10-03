

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Enter Number of Interior Walls : ");
        int inwall=scannerObject.nextInt();
        System.out.println("enter Number of Exteriror Walls : ");
        int outWall=scannerObject.nextInt();
        double[] inArea = new double[inwall];
        double[] outArea = new double[outWall];
        System.out.println("Enter inwalls Area");
        for(int i=0;i<inwall;i++)
        {
            inArea[i]=scannerObject.nextDouble();
        }
        System.out.println("Enter Outer Walsl Area");
        for(int j=0;j<outWall;j++)
        {
            outArea[j]=scannerObject.nextDouble();
        }
        double sum=0;
        for(int k=0;k<inArea.length;k++)
        {
            sum+=(inArea[k]*18);
        }
        double sum1=0;
        for(int k1=0;k1<outArea.length;k1++)
        {
            sum1+=(outArea[k1]*12);
        }
        System.out.println("Total cost of Painting is : " +(sum+sum1));
        scannerObject.close();
    }
    
    
}
