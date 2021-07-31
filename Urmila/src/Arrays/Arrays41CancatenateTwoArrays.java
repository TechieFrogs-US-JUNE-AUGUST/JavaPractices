package Arrays;

public class Arrays41CancatenateTwoArrays 
{
    public static void main(String[] args)
    {
        int array1[] = {1,2,3}; //initializing an array elements 
        int array2[] = {4,5,6,7};
        int array3[] = new int[array1.length+array2.length];// sum of lenghts of above two arrays
        int count = 0;
  
        for(int i = 0; i<array1.length; i++) // loop used to print  array1
        {
           array3[i] = array1[i];
           count++;
        }
  
        for(int j = 0;j<array2.length;j++) // loop used to print array2
        {
           array3[count++] = array2[j];
        }
  
        for(int i = 0;i<array3.length;i++)
        {
         System.out.print(array3[i]+" ");
        }
    }
    
}
