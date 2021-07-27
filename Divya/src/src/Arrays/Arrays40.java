package Arrays;
import java.util.Scanner;
public class Arrays40 {
    public static void array(int a[]) {
        System.out.println("the values of given array are:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size;
        size = s.nextInt();
        int a1[] = new int[size];
        System.out.println("enter the values of an array:");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = s.nextInt();
        }
        array(a1);
    }
}