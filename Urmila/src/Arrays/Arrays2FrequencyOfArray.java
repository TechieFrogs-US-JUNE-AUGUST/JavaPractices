package Arrays;
import java.util.Scanner;
public class Arrays2FrequencyOfArray 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=scanner.nextInt();
        int[] array= new int[n]; 
        int[] frequency =new int[n];
        System.out.println("Enter Elements in an Array :");
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt(); //enter elements in an array
            frequency[i]=-1;            // assigning  to duplicate array
        }
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(array[i]==array[j])//if duplicate element is found execute if loop
                {
                    count++;
                    frequency[j]=0;  //uses to avoid counting same element again
                }
            }
            if(frequency[i]!=0)
            {
                frequency[i]=count;
            }
        }
        System.out.println("Duplicate elements present in an array :");
        for(int i=0;i<n;i++)
        {
            if(frequency[i]!=0)
            {
                System.out.println(" Number " + array[i] + " occur " + frequency[i] + " times " );
            }
        }
        scanner.close();
    }
    
}
