package Assignment;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
      
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scannerObj.nextInt();
        int sum=0;
        int remainder,temporary;
        scannerObj.close();
        temporary=num;
        while(temporary!=0)
        {
            remainder=temporary%10;
            sum=sum+remainder;  // adds the last number to sum
            temporary=temporary/10; 

            if(temporary==0)
            {
                if(sum>9)
                {
                    temporary=sum;// again the while loop gets executed till sum<10 so that the sum is having single digit
                    
                    sum=0;
                }
            }


        }
        System.out.println("Number is : " +sum);
    }
    
}
