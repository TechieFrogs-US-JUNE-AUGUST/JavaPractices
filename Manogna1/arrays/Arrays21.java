package arrays;

import java.util.Arrays;

public class Arrays21 {
    public static void main(String[] args) {
        int array[]={23,12,56,75,89,46,10};
        System.out.println("Array before Sorting  :" +Arrays.toString(array));
        for(int i=0;i<array.length;i++) //Number of passes
        {
            for(int j=i+1;j<array.length;j++) //for Iteration
            {
                if(array[i]>array[j]) // condition is true
                {
                    int temporary;
                    temporary=array[i];//swap the values aand sort the array
                    array[i]=array[j];
                    array[j]=temporary;
                    //sorting of array program is equal to Array in Ascending Order bcz after sorting the array will be in ascending order

                }
            }
        }
        System.out.println("Array After Sorting : " +Arrays.toString(array));
    }
    
}
