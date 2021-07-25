public class Array9and10 
{
    public static void main(String[] args) 
    {
        int array[]= new int[]{1,2,3,4,5};                       //initialize an array
        int max=array[0];                                         //initialize max which stores the element value present in index 0.
        int min=array[0];                                        //initialize min which stores the element value present in index 0.
        
        System.out.print("Largest element present in given array : " );
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)                                    //compare elements of array with max
            {
                max=array[i];                                  //assign largest element to max
            }
        }
        System.out.println(max);                               // prints the largest element of tne array

        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)                                    //compare elements of array with min
            {
                min=array[i];                                  //assigns smallest element to min
            }
        }
        System.out.println("smallest element in the array is: "  +min);   //prints the smallest element of the array. 
    }
}