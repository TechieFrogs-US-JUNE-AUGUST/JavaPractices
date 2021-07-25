package arrays;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int n=2;//determines the number of times array should be repeated
        System.out.println("Original Array : " +Arrays.toString(array));
        for(int i=0;i<n;i++)
        {
            int first=array[0];
            int j;
            for( j=0;j<array.length-1;j++)
            {
                array[j]=array[j+1];//Shifts the element of array by one
            }
            array[j]=first;//first element of array will be added to end
        }
        System.out.println("Array After Left Rotation : " +Arrays.toString(array));

    }
    
}
