package arrays;

public class Arrays35 {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        double mean=0.0;
        double sum=0.0;
        double standardDeviation=0.0;
        double result=0.0;
        System.out.println("Elements are: ");
        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        for (int i=0;i<array.length;i++)
        {
            sum=sum+array[i];
        }
        mean=sum/array.length;
        for (int i=0;i<array.length;i++)
        {
            standardDeviation=standardDeviation+ Math.pow((array[i]-mean),2);
        }
        double sd=standardDeviation/array.length;
        result=Math.sqrt(sd);
        System.out.println("Standard Deviation of given Array is " +result);


    }
    
}
