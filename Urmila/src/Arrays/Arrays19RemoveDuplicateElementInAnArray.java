package Arrays;

public class Arrays19RemoveDuplicateElementInAnArray 
{
    public static void main(String[] args)
    {
        int array[]=new int[]{1,2,2,3,5,6,2,5}; //Initializing an array
        int length= array.length;
        System.out.println("Elements in an Array :");
        for(int i=0;i<length;i++)
        {
         System.out.println(array[i]);
            for(int j=i+1;j<length;j++)
            {
                 if(array[i]==array[j])
                 {
                     System.out.println(array[i]);
                     array[j]=array[length-1];                         
                     length--;     
                 }
            }      
        }
            System.out.println("New Array After Removing Duplicate Elements");
            for(int i=0;i<length;i++)
            {
             System.out.println(array[i]);
            }
    }
    
}
