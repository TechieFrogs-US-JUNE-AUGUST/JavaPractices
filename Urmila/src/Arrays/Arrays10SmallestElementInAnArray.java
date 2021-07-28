package Arrays;

public class Arrays10SmallestElementInAnArray
{
    public static void main(String[] args)
    {
        int array[]={1,2,3,4,5}; //initializing an array
        int min=array[0];//assigning first element of an array 
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)//compares elements of array using this
            min=array[i];//assigns smallest value to minimum
        }
          System.out.println("Smallest element in an array : " +min);
    }
    
}
