package Arrays;

public class Arrays12PrintSumofAllItemsofArray 
{
    public static void main(String[] args)
    {
    /*  int a[]=new int[5];//declaration and instantiation  
        a[0]=4;           //initialization of array values 
        a[1]=6;  
        a[2]=8;  
        System.out.println(a[0]+a[1]+a[2]); 
    */ 
        int array[] = new int[]{4,6,8};//initializing array
        int sum = 0;
        for(int i=0;i <array.length;i++)
        {
            sum = sum+array[i];
        }
        System.out.println("Sum of elements of an array:"+sum);
        

    }
    
}
