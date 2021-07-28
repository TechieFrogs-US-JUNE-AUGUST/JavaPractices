package Arrays;

public class Arrays13RotateRightElementsOfArray 
{
    public static void main(String[] args)
    {  
        int [] array = new int [] {1, 2, 3,4,5}; // initializing an array     
        int n = 3;//n is used to  determine the num of times an array should be rotated.       
        System.out.println("Original array: ");//Displays original (given)array      
        for (int i = 0; i < array.length; i++)
        {     
            System.out.print(array[i] + " ");     
        }         
        for(int i = 0; i < n; i++)//loop used to rotate the given array by n times toward right 
        {    
            int j, last;        
            last = array[array.length-1];    //used to store last element in an array
            
            for(j = array.length-1; j > 0; j--)
            {       
                array[j] = array[j-1];    //Shift element of array by value 1  
            }       
            array[0] = last;  //used for last element of array will be added to the start of array.   
        }    
        
             System.out.println();    
              
            System.out.println("Array after right rotation: "); //prints an array after rotation     
            for(int i = 0; i< array.length; i++)
            {    
            System.out.print(array[i] + " ");    
            }    
    }
}
