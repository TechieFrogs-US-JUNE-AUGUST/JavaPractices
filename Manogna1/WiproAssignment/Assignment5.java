package WiproAssignment;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("INPUT");
        int num=scannerObj.nextInt();
        int nums[]=new int[num];
        for(int i=0;i<num;i++)
        {
            nums[i]=scannerObj.nextInt();
        }
        scannerObj.close();
        int sum=0,temp;
        System.out.println("OUTPUT");
        for(int i=0;i<num;i++)
        {
             sum=0;
            while(nums[i]>0)
            {
                temp=nums[i]%10;
                sum=sum+temp;
                nums[i]=nums[i]/10;
            }
            System.out.print(" " +sum);
        }
        
        System.out.println();
    }
    
}
