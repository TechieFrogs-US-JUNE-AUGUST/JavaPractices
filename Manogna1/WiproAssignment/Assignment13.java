package WiproAssignment;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter total numbers");
        int num=scannerObj.nextInt();
        System.out.println("Enter Minimum and maximum range of numbers : ");
        int range[]=new int[2];
        for(int i=0;i<2;i++)
        {
            range[i]=scannerObj.nextInt();
        }
        System.out.println("Enter Numbers : ");
        int numbers[]=new int[num];
        for(int i=0;i<num;i++)
        {
            numbers[i]=scannerObj.nextInt();
        }
        System.out.println("Numbers donot lie between " + range[0] + " and " + range[1] + " are ");
        for(int i=0;i<num;i++)
        {
            if(numbers[i]<range[0] || numbers[i]>range[1])
            {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        scannerObj.close();

    }
    
}
