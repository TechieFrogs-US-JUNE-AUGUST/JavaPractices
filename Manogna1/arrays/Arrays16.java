package arrays;

public class Arrays16 {
    public static int getThirdLargestNumber(int[] array,int length)
    {
        int temporary=0;
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(array[i]>array[j])
                {
                    temporary=array[i];
                    array[i]=array[j];
                    array[j]=temporary;//it sorts the array in ascending order
                }
            }
        }
        return array[length-3];//returns the third largest number
    }
    public static void main(String[] args)
     {
        int array1[]={19,44,42,50,16,14,26};
        System.out.println("Third Largest Number is : " +getThirdLargestNumber(array1,array1.length));
        
    }
    
}
