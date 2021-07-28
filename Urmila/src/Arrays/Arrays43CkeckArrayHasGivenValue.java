package Arrays;
import java.util.Scanner;
public class Arrays43CkeckArrayHasGivenValue 
{
    public static void main(String[] args)
    {
        int array[]= {11,12,13,14,15};    //Initializing an array elements
       Scanner scanner= new Scanner(System.in); //scanner is used to read input from user
       System.out.println("Enter a number: ");
       int number= scanner.nextInt();
        boolean count= false;

        for(int i=0; i<array.length; i++)// Loop used to iterate through the array
        {            
            if(array[i] == number) //condition to check  if the entered number matches within the array
            {                 
                count= true;    //if the condition is true, count value changes to true
                break;
            }
        }
        if(count)
        {
            System.out.println("Number " + number + " is found in an array");
        }else
        {
            System.out.println("Number " + number + " is not found in anarray");
            scanner.close();
          } 
    }
    
}
