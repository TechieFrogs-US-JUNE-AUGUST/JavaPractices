package tcscodingquestions;

import java.util.Scanner;

public class Assignment18 
{
    
    public static void main(String[] args) 
    {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter n Value");
        int n=scannerObj.nextInt();
        Assignment18 obj= new Assignment18();
        System.out.println(obj.getNthNumber(n));
        scannerObj.close();    
    }
  
        int getNthNumber(int n)
        {
            int number[]=new int[n];
            int i2=0,i3=0,i5=0;
            int multipleof2=2;
            int multipleof3=3;
            int multipleof5=5;
            int nextnum=1;
            number[0]=1;
            for(int i=1;i<n;i++)
            {
                nextnum=Math.min(multipleof2, Math.min(multipleof3, multipleof5));
                number[i]=nextnum;
                if(nextnum==multipleof2)
                {
                    i2=i2+1;
                    multipleof2=number[i2]*2;
                }
                if(nextnum==multipleof3)
                {
                    i3=i3+1;
                    multipleof3=number[i3]*3;
                }
                if(nextnum==multipleof5)
                {
                    i5=i5+1;
                    multipleof5=number[i5]*5;
                }
            }
            return nextnum;
        }
}
    

