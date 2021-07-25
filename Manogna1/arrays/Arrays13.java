package arrays;

import java.util.Arrays;

public class Arrays13 {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        System.out.println("Original Array : " +Arrays.toString(array));
        int n=3;//determines number of times array should be rotated
        for(int i=0;i<n;i++)
        {
            int last =array[array.length-1];//stores the last element
            int j;
            {
                for(j=array.length-1;j>0;j--)
                {
                    array[j]=array[j-1];//shift the element by one
                }
                array[0]=last;//last element will be added to starting of the array

            }
        }
        System.out.println("Array after Right Rotation : " +Arrays.toString(array));
    }
    
}
