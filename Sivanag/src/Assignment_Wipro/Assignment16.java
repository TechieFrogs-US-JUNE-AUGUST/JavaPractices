package src.Assignment_Wipro;

import java.util.Scanner;

public class Assignment16 {
    static int integerInput()
    {
        Scanner scannerObj=new Scanner(System.in);
        int num;
        do{
            //System.out.print("Enter Number : ");
            while(!scannerObj.hasNextInt())
            {
                System.out.print("Enter Positive Number:");
                scannerObj.next();
            }
            num = scannerObj.nextInt();
            
        }while(num<1000 && num>9999);
        //scannerObj.close();
        return num;
    }
    static int largestDigit(int num)
    {
        int temp,max=0;
        while(num>0)
        {
            temp=num%10;
            if(max<temp)
            max=temp;
            num/=10;
        }
        return max;
    }
    static int secondlargestDigit(int num,int largest)
    {
        int temp,max=0;
        while(num>0)
        {
            temp=num%10;
            if(max<temp && temp!=largest)
            max=temp;
            num/=10;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.print("Enter three Numbers: ");
        int num1=integerInput();
        int num2=integerInput();
        int num3=integerInput();
        int max1=largestDigit(num1);
        int max2=largestDigit(num2);
        int max3=largestDigit(num3);
        int smax1=secondlargestDigit(num1, max1);
        int smax2=secondlargestDigit(num2, max2);
        int smax3=secondlargestDigit(num3, max3);
        System.out.println("keys: " +((max1+max2+max3)-(smax1+smax2+smax3)));
    }
    
}
