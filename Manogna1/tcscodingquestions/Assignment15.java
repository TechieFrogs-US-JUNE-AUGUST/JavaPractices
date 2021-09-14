package tcscodingquestions;

import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
       int even=0;
       int odd=0;
       Scanner scannerObj=new Scanner(System.in);
       System.out.println("Enter n Value");
       int n=scannerObj.nextInt();
       if(n%2==0)//for even
       {
        for(int i=1;i<=(n-2);i=i+2)
        {
            even=even+2;
            odd=(even/2);
        }
        System.out.println(odd);
       }
       else //for odd
       {
        for(int i=1;i<=(n-2);i=i+2)
        {
            even=even+2;
            odd=(even/2);
        }
        System.out.println(even);
       }
       scannerObj.close();
    }
    
}
