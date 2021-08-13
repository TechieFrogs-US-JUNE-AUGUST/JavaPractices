package tcscodingquestions;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        float intP = 18, extP = 12, cost = 0, temp;
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Number of Interior Walls");
        int ni=scannerObj.nextInt();
        System.out.println("Number of Exterior Walls");
        int ne=scannerObj.nextInt();
        if(ni<0 && ne<0)
        {
            System.out.print("INVALID INPUT");
        }
        else if(ni==0 && ne==0)
        {
            System.out.println("Total Estimated Cost : 0.0");
        }
        else
        for(int i=0;i<ni;i++)
        {   System.out.println("Surface area of Interior in square feet");
            temp=scannerObj.nextFloat();
            cost=cost+(intP*temp);

        }
        for(int i=0;i<ne;i++)
        {
            System.out.println("Surface area of Exterior in square feet");
            temp=scannerObj.nextFloat();
            cost=cost+(extP*temp);
        }
        System.out.println("Total Estimated Price : " +cost);
        scannerObj.close();
    }
    
}
