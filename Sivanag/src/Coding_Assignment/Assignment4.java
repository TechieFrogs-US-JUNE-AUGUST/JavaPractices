package src.Coding_Assignment;


import java.util.Scanner;



public class Assignment4
{
    static int min(int a,int b)
    {
        if(a>b)
            return b;
            else
            return a;
    }
    static int absolute(int[] array)
    {
        int n= array.length;
        int sum=0;int a,b;
        a= array[0]-array[1];
        if(a<0)a*=-1;
        sum+=a;
        System.out.print(sum + " ");
        b=(array[n-1]-array[n-2]);
        if(b<0)b*=-1;
        sum+=b;
        //System.out.print(sum + " ");
        for(int i=1;i<n-1;i++)
        {
            a= array[i]-array[i-1];
            b=array[i]-array[i+1];
            if(a<0)a*=-1;
            if(b<0)b*=-1;
            sum+=min(a,b);
        //System.out.print(sum + " ");
        }

        return sum;
    }
  
    static void sort(int[] array)
    {
        int temp;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
                    
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of element is an Array : ");
        int num=sc.nextInt();
        System.out.println("Enter Array Elements");
        int array[]=new int[num];
        for(int i=0;i<num;i++)
        {
            array[i]=sc.nextInt();
        }
        sort(array);
        // for(int k=0;k<array.length;k++)
        // {
        //     System.out.print(array[k] + " ");
        // }
       System.out.println("Sum of minimum Absoute Difference of Elements in an Araay is : " +absolute(array)); 
        sc.close();
        
    }


}