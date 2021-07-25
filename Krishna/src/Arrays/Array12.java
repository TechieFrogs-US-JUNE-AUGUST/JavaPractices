
public class Array12 
{    
    public static void main(String[] args) 
    {
        int array[]=new int[]{1,2,3,4,5};                             //array is initialized with 5 elements 
        int sum=0;                                                   //sum varaible stores the addition result 
        for(int i=0;i<array.length;i++)                             // i value gets increased until it is less than the array length. 
        {
            sum=sum+array[i];                                       //array[i] gives the element present aat ith location in the array
        }
        System.out.println("Sum of elements in an Array : " +sum);
    }
}