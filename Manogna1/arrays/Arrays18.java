package arrays;

public class Arrays18 {
    public static int getSecondSmallestNumber(int[] array,int length)
    {
        int temporary=0;
        for(int i=0;i<length;i++)
        {
            for (int j=i+1;j<length;j++)
            {
                if(array[i]<array[j])
                {
                    temporary=array[i];
                    array[i]=array[j];
                    array[j]=temporary;//sort array in descending order
                }
            }
        }
        return array[length-2];//returns the second smallest Number
    }
    public static void main(String[] args) {
        int array1[]={19,42,44,16,50,14,26};
        System.out.println("Second Smallest Number is : " +getSecondSmallestNumber(array1, array1.length));
    }
    
}
