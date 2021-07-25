public class Array4                                                // to print duplicate elements of an array
{
    public static void main(String[] args) 
    {
       int array[]=new int[]{1,1,2,2,3,5};

       System.out.println("Duplicate elements in an Array :");

       for(int i=0;i<array.length;i++)
       {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])

                System.out.println(array[i]); 
                
            }      
       }
    }
}