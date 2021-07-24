package Arrays;

import java.util.Scanner;

public class Array2                                                       //prog to find frequency of each element
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");

        int num =sc.nextInt();                                            // num is the size of array i.e no of elements in an array.
        int array[]= new int[num]; 
        int freq[]=new int[num];

        System.out.println("Enter Elements in an Array :");

        for(int i=0;i<num;i++)
        {
            array[i]=sc.nextInt();                                         //enter elements in an array
            freq[i]=-1;                                                   // assign to duplicate array
        }
        System.out.println("duplicate elements are ");
        for(int i=0;i<num;i++)
        {
            int count=1;
            for(int j=i+1;j<num;j++)
            {
                if(array[i]==array[j])                                //if duplicate element is found execute if loop
                {
                    System.out.println(+array[i]+ " ");              // prints the duplicate elements if present.
                    count++;
                    freq[j]=0;                                       //to avoid counting same element again     
                }
            }
            if(freq[i]!=0)
            {
                freq[i]=count;
            }
        }

        System.out.println("frequency of each element in the array are :");

        for(int k=0;k<num;k++)
        {
            if(freq[k]!=0)
            {
                System.out.println(" Number " + array[k] + " occured " + freq[k] + " times " );
            }
        }
        sc.close();
    }
}