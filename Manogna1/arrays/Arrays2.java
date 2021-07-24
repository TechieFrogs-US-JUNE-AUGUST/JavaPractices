package arrays;

import java.util.Scanner;

public class Arrays2 //prog to find frequency of each element
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=sc.nextInt();
        int[] array= new int[n]; 
        int[] freq=new int[n];
        System.out.println("Enter Elements in an Array :");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt(); //enter elements in an array
            freq[i]=-1; // assign to duplicate array
        }
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(array[i]==array[j])//if duplicate element is found execute if loop
                {
                    count++;
                    freq[j]=0;//to avoid counting same element again
                }
            }
            if(freq[i]!=0)
            {
                freq[i]=count;
            }
        }
        System.out.println("Duplicate elements in an array :");
        for(int i=0;i<n;i++)
        {
            if(freq[i]!=0)
            {
                System.out.println(" Number " + array[i] + " occur " + freq[i] + " times " );
            }
        }
        sc.close();
    }
}
