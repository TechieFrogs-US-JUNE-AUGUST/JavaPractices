//TO CALCIULATE STANDARD DEVIATION
package Arrays_Assignment;

public class Arrays35 {
    public static void main(String[] args) {
        int array[]={5,10,15,20,25};               //initialisation
        double sum=0, mean=0, variance=0;

        for(int i=0; i<array.length; i++){
            sum= sum+array[i];                     //iterates through the array and add every element to sum
        } 
        mean = sum/array.length;                  //calculating the mean
        System.out.println("Mean: " +mean);

        for(int i=0; i<array.length; i++){
            variance= variance+Math.pow((array[i]-mean), 2)/array.length;        //calculating the variance-->sum of square of difference of mean with individual element/total length
        }
        double deviation= Math.sqrt(variance);                              //calculating sd-->square-root of variance
        System.out.println("Standard deviation: " +deviation);
    }
}
