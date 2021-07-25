package arrays;

public class Arrays17 {
    public static int getsecondLargestNumber(int[] array,int length)
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
                    array[j]=temporary;
                }
            }
        }
        return array[length-2];//returns the Second Largest Number
    }
    public static void main(String[] args) {
        int array1[]={19,26,42,44,50,16,14};
        System.out.println("Second Largest Number is : " +getsecondLargestNumber(array1, array1.length));
    }
    
}
