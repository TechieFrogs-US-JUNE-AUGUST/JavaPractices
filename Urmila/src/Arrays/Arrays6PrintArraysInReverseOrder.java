package Arrays;

public class Arrays6PrintArraysInReverseOrder 
{
    public static void main(String[] args)
    {
        int [] array = new int [] {11, 22, 33, 44, 55}; //Initializing the array   
        System.out.println("Print the Array: ");  
        for (int i = 0; i < array.length; i++)
        {  
            System.out.print(array[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");
        for (int i = array.length-1; i >= 0; i--) 
        {  
            System.out.print(array[i] + " ");  
        }
    }
}
