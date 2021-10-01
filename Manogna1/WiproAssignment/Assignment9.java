package WiproAssignment;

import java.util.Scanner;

public  class Assignment9 {
        public static void main(String[] args) {
        System.out.println("Enter total numbers :");
        Scanner scannerObj=new Scanner(System.in);
        int num=scannerObj.nextInt();
        System.out.println("Enter Numbers :");
        int numbers[]=new int[num];
        
        for(int i=0;i<num;i++)
        {
            numbers[i]=scannerObj.nextInt();
        }
        scannerObj.close();
        System.out.println("Output");
        int j=0,temp;
        for(int i=0;i<num;i++)
        {
            if(primeNumber(numbers[i]))
            {
                temp=numbers[j];
                numbers[j]=numbers[i];
                numbers[i]=temp;
                j++;
            }
        }
        
        for(int i=0;i<num;i++)
        {
            System.out.print(numbers[i] + " ");
        }


    }
    static Boolean primeNumber(int num)
    {
        int cnt=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            cnt++;
        }
        if(cnt>0)
            return false;
            else
            return true;
    }    

}
