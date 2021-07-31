package Arrays;

public class Arrays16FindThirdLargestNumber 
{
    public static void main(String[] args)
    {
        int temp, size;
        int array[] = {1, 4,6,9,0};//Initializing an array 
        size = array.length;
   
        for(int i = 0; i<size; i++ )
        {
        for(int j = i+1; j<size; j++)
        {
         if(array[i]>array[j])
         {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
         }
        }
    }
         System.out.println("Third largest number in an Array is:: "+array[size-3]);
    }
    
}
