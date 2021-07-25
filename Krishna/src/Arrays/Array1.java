public class Array1
{
    public static void main(String[] args) 
    {
        int originalarray[]={1,2,3,4,5};                                                   //Initialize an array with integer values
        int copiedarray[]=new int[originalarray.length];                                       //initialize another array with same size
        System.out.println("Original Array :" );

       for(int i=0;i<originalarray.length;i++)
        {
            System.out.println(originalarray[i] + " ");                                //to print the original array
        }
        System.out.println("Copied Array ");
        for(int i=0;i<copiedarray.length;i++)
        {
            copiedarray[i]=originalarray[i];                                             //copy array1 to array2
            System.out.println(copiedarray[i] + " ");                            //to print copied array
        }

        char array1[] = {'a', 'b','c'};                                        // array with characters
        char array2[] = new char[array1.length];
        //System.out.println("array1 is: " +array1);
        System.arraycopy(array1, 0, array2, 0, array1.length);                //syntax is System.arraycopy(src, srcPos, dest, destPos, length);
        //System.out.println("array2 is: " +array2);
        System.out.println("array2 is: " +String.valueOf(array2));             // prints the copied array2 value.
    }  
}