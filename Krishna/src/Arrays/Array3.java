package Arrays;
import java.util.Scanner;

public class Array3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter length of array");

        int length=sc.nextInt();                                         //enter the array length.
        int array[]=new int[length];                                    // new array is initialized  with length same as the previous one.

        System.out.println("enter the elements of array");

        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();                                    // enter the elements in the array.
        }

        System.out.println("enter no of left rotations to happen ");

        int noOfrotations=sc.nextInt();                               // enter the value of no of rotations to be done.

        System.out.println("original array");                          

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");                          //prints the original array before rotations
        }
       
        for(int i=0;i<noOfrotations;i++)
        {
            int temp=array[0];                                     // temp variable is created to store the original array 
        for(int j=0;j<length-1;j++)
        {
            array[j]=array[j+1];
        }
        array[array.length-1]=temp;
        
    System.out.println();
    System.out.println("left rotated array");

    for(int j=0;j<array.length;j++)
    {
        System.out.print(array[j]+" ");                        // prints the rotated array.
    }
        }    
    sc.close();
    }
}