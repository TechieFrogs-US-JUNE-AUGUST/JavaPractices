//TO FIND THE FREQUENCY OF EACH ELEMENT IN ANA ARRAY
package Arrays_Assignment;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=scan.nextInt();

        int[] array= new int[n]; 
        int[] freq= new int[n];

        System.out.println("Enter Elements in an Array :");
        for(int i=0; i<n; i++){
            array[i]= scan.nextInt();                          //Entering elements in an array
            freq[i]= -1;                                       // assign to duplicate array
        }
        for(int i=0; i<n; i++) {
            int count=1;
            for(int j=i+1; j<n; j++) {
                if(array[i] == array[j]) {                  //If there is a duplicate element it increments the count
                    count++;
                    freq[j]= 0;                              //to avoid counting same element again
                }
            }
            if(freq[i]!=0){                               
                freq[i]= count;
            }
        }
        System.out.println("Duplicate elements in an array are: ");
        for(int i=0; i<n; i++){
            if(freq[i]!=0) {
                System.out.println("Frequency of " +array[i]+ " is " +freq[i] );
            }
        }
        scan.close();
    }
}
