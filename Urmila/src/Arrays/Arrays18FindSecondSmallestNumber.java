package Arrays;

public class Arrays18FindSecondSmallestNumber 
{
    public static void main(String[] args)
    {
        int temp,size;
        int array[] = {1, 4,6,9,0};//Initializing an array 
        size = array.length;
         for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
         System.out.println("Second smallest number of given in an array: "+array[1]);
}
}