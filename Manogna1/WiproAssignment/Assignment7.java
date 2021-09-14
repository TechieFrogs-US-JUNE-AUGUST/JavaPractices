package WiproAssignment;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter total numbers");
        int num=scannerObj.nextInt();
        System.out.println("Enter numbers :");
        int numbers[]=new int[num];
        for(int i=0;i<num;i++)
        {
            numbers[i]=scannerObj.nextInt();
        }
        System.out.println("Enter postions : ");
        int pos[]=new int[2];
        for(int i=0;i<2;i++)
        {
            pos[i]=scannerObj.nextInt();
        }
        int temp=numbers[pos[0]];
        numbers[pos[0]]=numbers[pos[1]];
        numbers[pos[1]]=temp;
        System.out.println("output");
        for(int i=0;i<num;i++)
        {
            System.out.print(numbers[i] + " ");
        }
        scannerObj.close();
    }
    
}
