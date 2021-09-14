package tcscodingquestions;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        int trainee[][]=new int[3][3];
        int average[]=new int[3];
        Scanner scannerObj=new Scanner(System.in);
        int max=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                trainee[i][j]=scannerObj.nextInt();
                if(trainee[i][j]<0 || trainee[i][j]>100)
                {
                    trainee[i][j]=0;
                }
            }
        }
        scannerObj.close();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                average[i]=average[i]+trainee[j][i];
            }
            average[i]=average[i]/3;
        }
        for(int i=0;i<3;i++)
        {
           if(average[i]>max)
           {
               max=average[i];
           }
        }
        for(int i=0;i<3;i++)
        {
            if(average[i]>max)
            {
                System.out.println("Trainee Number :" +(i+1));
            }
            if(average[i]<70)
            {
                System.out.println("Trainee is Unfit");
            }
        }
    }
    
}
