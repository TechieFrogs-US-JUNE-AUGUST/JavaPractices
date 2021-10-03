import java.util.Arrays;
import java.util.Scanner;

public class CodingS4 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Give the array length : ");
        int length = scannerObj.nextInt();
        int array[] = new int[length];
        System.out.println("Give the values to array");//12, 10, 15, 22, 21, 20, 1, 8, 9
        for(int i = 0; i < length; i++){
            array[i] = scannerObj.nextInt();
        }
        Arrays.sort(array); //sorting an array into ascending order, to calculate the difference easly
        int sum = 0;
        for(int i = 1; i < length; i++){
           sum  = sum + (array[i] - array[i-1]);
           // System.out.print(sum+" ");
        }
        System.out.println(sum);
        scannerObj.close();
    }
}
