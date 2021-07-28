package Arrays;

public class Arrays35CalculateStandardDeviation 
{
    public static void main(String[] args)
    {
        int array[]={5,10,15,20,25};               //Initializing an array elements
            double sum=0, mean=0, variance=0;
            for(int i=0; i<array.length; i++)
            {
                sum= sum+array[i];                  //sum method to store sum of all array  variables
            }
            mean = sum/array.length;                  // mean is getting by divide the array length by sum
            System.out.println("Mean: " +mean);
            for(int i=0; i<array.length; i++)
            {
             variance= variance+Math.pow((array[i]-mean), 2)/array.length; //formula to calculate  the variance
            }
             double deviation= Math.sqrt(variance); // by square root of the variance we will get deviation
             System.out.println("Standard deviation: " +deviation);
    }
    
}
