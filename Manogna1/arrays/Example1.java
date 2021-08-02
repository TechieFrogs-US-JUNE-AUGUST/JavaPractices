package arrays;

import java.util.Arrays;


public class Example1 {
    public static void main(String[] args) {
        int array[]={1,2,0,4,0,8,0,4,0,9,0};
        int array1[]=new int[array.length];
        int j=0;
        for(int i=0;i<array.length;i++)
        {
         if(array[i]>0)
                {
                    array1[j]=array[i];
                  j++;
                
                }
            
    }
        
        System.out.println(Arrays.toString(array1));
    }
    
}
