//Program to find the sum of minimum absolute difference of each array element in a given array.
// Min abs diff formula is:  min(abs(x - array[j])) where 1<=j<=n and j!=i

package CodingAssessment_Questions;
import java.util.Arrays;

public class Prog4 {
    public static int sumOfMinAbsDifference(int array[], int n){         //metgod to find the sum of min abs diff
        Arrays.sort(array);                                            //sorting the given array
        int sum= 0;
        sum= sum + Math.abs(array[0] - array[1]);                     //min abs diff for the 1st array element
        sum= sum + Math.abs(array[n-1] - array[n-2]);                 //min abs diff for the last array element
        for(int i=1; i<n-1; i++){                                     //for finding the min abs diff for the rest of the elements i.e, 1<=i<=n-2
            sum= sum + Math.min(Math.abs(array[i] - array[i-1]), Math.abs(array[i] - array[i+1]));
        }
        return sum;                                                   //returns the req sum
    }
    public static void main(String[] args) {
        int array[]= {5,10,1,4,8,7};                                  //initialsing the array
        int n= array.length;                                          //length of the array is stored in 'n'
      
        System.out.println("Sum is: " +sumOfMinAbsDifference(array, n));     //calling method by passing 2 arguments 'array' and 'n' as i/p
    }
}
