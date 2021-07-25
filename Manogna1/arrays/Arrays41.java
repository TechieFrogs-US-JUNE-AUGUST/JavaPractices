package arrays;

import java.util.Arrays;

public class Arrays41 {
    public static void main(String[] args) 
    {  
        int array1[]={12,15,17,19,21};
        int array2[]={22,55,44,11,9};
        int array3[]=new int[array1.length+array2.length];//length of array3 is sum of frst two arrays
        int count=0;
        for(int i=0;i<array1.length;i++)
        {
            array3[i]=array1[i];//assigning array1 values to array3
            count++;
        }
        for(int j=0;j<array2.length;j++)
        {
            array3[count++]=array2[j];// assigning array2 values to array3
            
        }

        System.out.println("After concaatenate of two Arrays :" +Arrays.toString(array3));
    }

    
}
