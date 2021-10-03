

import java.util.Scanner;
public class Assignment19 {
    static boolean  armStrong(int num)
    {
        
        int sum=0;
        int temp=num;
        while(num>0)
        {
            int r=num%10;
            sum=sum+(r*r*r);
            num=num/10;
        }
        if(sum!=temp)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter From Number :");
        int fromNum=sc.nextInt();
        System.out.print("Enter To Number :");
        int toNum=sc.nextInt();
        if(fromNum>toNum || fromNum < 0 || toNum<0)
        {
            System.out.println("Invalid Input");
        }else
        {
            System.out.println("Armstrong Numbers between "+fromNum +"to"+toNum+ "are ");
            for(int i=fromNum;i<=toNum;i++)
            {
                if(armStrong(i))
                {
                    System.out.print(i +" ");
                }
            }
        }
                sc.close();
    }
    
}
