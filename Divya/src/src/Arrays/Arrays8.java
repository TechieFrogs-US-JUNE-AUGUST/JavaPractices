import java.util.Scanner;

public class Arrays8 {
    static int arr[]=new int[5];                //declaring and initialising array variable
    public  static void methd1(int arrymet[]){
        for(int i=0;i<arrymet.length;i=i+2){           // loop to print the odd position of array elements
            System.out.println(arrymet[i]);
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);            // craation of Scanner objects
        for(int i=0;i<arr.length;i++){                //loop to take the inputs from the user
            arr[i]=s.nextInt();
        }
        methd1(arr);
    }
}