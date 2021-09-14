package Arrays;

public class Arrays7EvenPosition 
{
    public static void main(String[] args)
    {
        int array[]= new int[]{1,2,3,4,5,6};//initializing array and assigning values
        System.out.println("Elements of an array present in even position are: ");
        for(int i=1; i<array.length; i=i+2)// incrementing i value by 2
        
        {           
            System.out.println(array[i]);            
        }
    }
    
}
