package Arrays;

public class Array5and6
{
    public static void main(String[] args) 
    {
       int array[]=new int[]{1,2,3,4,5};
       System.out.println("elements in the array are: " );

       for(int i=0;i<array.length;i++)
       { 
        System.out.println(array[i]);                          //prints elements in the array
       }

       System.out.println("elements in reverse order: ");
       for( int i=array.length-1;i>=0; i--)
       {
           System.out.println(array[i]);                       //prints the elements present in the array in reverse order.
       }
    }
}