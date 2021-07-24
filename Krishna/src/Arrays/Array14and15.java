package Arrays;

import java.util.Scanner;

public class Array14and15 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int num =sc.nextInt();                                            // num is the size of array i.e no of elements in an array.
        int array[]= new int[num];                                        //array is initialized with same size as that of num.

        System.out.println("Enter Elements in an Array :");

        for(int i=0;i<num;i++)
        {
            array[i]=sc.nextInt();                                         //enter elements in an array
        }

        int temporary=0;                                                 //Assign a temporary variable with 0
        System.out.println("Array in Ascending order :");

        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])                 // checks the value present at i and j locations.
                {
                    temporary=array[i];                                 //sort the values in ascending order
                    array[i]=array[j];
                    array[j]=temporary;
                }
            }
            System.out.println(array[i]);
        }
        System.out.println("Array in decending order :");

        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]<array[j])                 // checks the value present at i and j locations.
                {
                    temporary=array[i];                                 //sort the values in decending order
                    array[i]=array[j];
                    array[j]=temporary;
                }
            }
            System.out.println(array[i]);
        }
          sc.close();
    } 
}