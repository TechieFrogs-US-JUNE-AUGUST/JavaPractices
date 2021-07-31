package Arrays;

public class Arrays3RotateTheElementsOfArray 
{
    public static void main(String[] args)
    {
        int [] arr = new int [] {1, 2, 3, 4, 5};  //Initializing the array  
        int n = 3;   //n is used determine the num of times an array should be rotated   
        System.out.println("Original array: "); //Displays original array
        for (int i = 0; i < arr.length; i++) 
        {  
            System.out.print(arr[i] + " ");  
        }    
        for(int i = 0; i < n; i++) //Rotate the given array by n times towards left
        {  
            int j, first;          //Stores the first element of the array  
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++)
            {  
                arr[j] = arr[j+1];  //it shifts element of array by one value  
            }   
                arr[j] = first;  //First element of array will be added to the end 
        }  
            System.out.println();  
            System.out.println("Array after left rotation: ");  //prints resulting array after rotating  
            for(int i = 0; i< arr.length; i++)
            {  
            System.out.print(arr[i] + " "); 
            } 
    }
}
