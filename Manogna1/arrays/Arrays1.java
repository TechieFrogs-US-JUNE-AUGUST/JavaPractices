package arrays;

public class Arrays1  //prog to copy all elements of one array to another array
{
    public static void main(String[] args) {
        int array1[]={1,2,3,4,5}; //Initialize an array
        int array2[]=new int[array1.length]; //initialize another array with same size
        System.out.println("Original Array :" );
        for(int i=0;i<array1.length;i++)
        {
            System.out.println(array1[i] + " ");//to print the original array
        }
        System.out.println("Copied Array ");
        for(int i=0;i<array2.length;i++)
        {
            array2[i]=array1[i];//copy array1 to array2
            System.out.println(array2[i] + " "); //to print another array(copied)
        }
    }
    
}
