package src.Tcs_Assignment;

import java.util.Scanner;

public class Assignment13 {
    static int series2(int num,int type)
    {
        int[] even =new int[num];
        int k=0;
        for(int i=0;i<num;i++)
        {
            even[i]=k;
            k+=type;
        }
        if(type==2)
        {
            return even[(num/2)];
        }else
        return even[(num+1)/2-1];

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter nth term");
        int num=sc.nextInt();
        if(num%2!=0)
        System.out.println( series2(num, 7));
          
        else
        System.out.println( series2(num, 6));
        sc.close();
        
    }

    
}
