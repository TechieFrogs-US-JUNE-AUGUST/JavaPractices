package Arrays;
import java.util.Scanner;
public class Arrays34CalculateAverage 
{
    public static void average(int a[])
    {
        int sum = 0;
        double average;          //creating array to find the average 
        System.out.println("Average value of given array is:");
        for (int i = 0; i < a.length; i++)
         {
            sum = sum + a[i];}
             average = sum / a.length;
        System.out.println(average);
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int size;                             // scanner used to take the inputs from the user
        System.out.println("enter the size of an array:");
        size=scanner.nextInt();
        int a1[]=new int[size];
        System.out.println("enter the elements of an array:");
        for(int i=0;i<a1.length;i++)             // loop used  to read the input values
        {    
        a1[i]=scanner.nextInt();
        }
        average(a1);                            //calling method for average
       
    }
    
}
