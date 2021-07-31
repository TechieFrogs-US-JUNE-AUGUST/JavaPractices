package Arrays;

public class Arrays9LargestElementInAnArray 
{
    public static void main(String[] args)
    {
        int array[]= {5,4,3,8,5}; //initializing an array
        int max=array[0];       //Used to initialize the first element of row
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)    //compare elements of array using this
            {
                max=array[i];   //assigns largest element to max
            }

        }
        System.out.println("Largest element in an array : " +max);
          
    }
    
}
