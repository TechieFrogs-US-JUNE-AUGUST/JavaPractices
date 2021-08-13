package tcscodingquestions;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
       Scanner scannerObj=new Scanner(System.in);
       System.out.println("Enter Source ");
       String source=scannerObj.nextLine();
       System.out.println("Enter Destination");
       String destination= scannerObj.nextLine();
       //System.out.println("Fair is");
      int path[]= {800, 600, 750, 900, 1400, 1200, 1100, 1500};
        String bustop[] = {"TH","GA", "IC", "HA", "TE", "LU", "NI","CA" };
        int intValue=0;
        float fair=0;
        for(int i=0;i<8;i++)
        {
            if(bustop[i].equals(source))
            {
                intValue=i;
                break;
            }

        }
        for(int j=intValue+1;j<=8;j++)
        {
            if(bustop[intValue].equals(destination))
            {
                System.out.println("Invalid Input");
                break;
            }
            else
            {
                j=j%8; //after 8 it will check for 1
                fair=(float)(fair+(path[j]*0.005));//100m=5inr so 1m=0.005
                if(bustop[j].equals(destination))
                {
                   
                    System.out.println("Fair is " +Math.ceil(fair) +"INR");
                    break;

                }
            }
        }
        scannerObj.close(); 
}
}
