package Arrays;
import java.util.Scanner;
public class Arrays16 {
    public static void max(int[] arr) {
        int max1 = Integer.MIN_VALUE,max2 = Integer.MIN_VALUE, max3 =Integer.MIN_VALUE ;
        for (int i : arr) {
            if (i > max3) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max3 = max2;
                max2 = i;
            } else {
                max3 = i;
            }
        }
        System.out.println("Third largest element:"+max3);
    }
    public static void main(String[] args) {
        int arr1[]=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        max(arr1);
    }
}