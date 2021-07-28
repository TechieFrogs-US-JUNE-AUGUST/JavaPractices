import java.util.Arrays;
import java.util.Scanner;

public class Array41Concat {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter length of 1st Array : ");
        int length1 = scannerObj.nextInt();
        int Array1[] = new int[length1];
        System.out.print("Enter 1st Array : ");
        for (int i= 0 ; i< length1 ; i++)
            Array1[i] = scannerObj.nextInt();
        System.out.print("Enter length of 2nd Array : ");
        int length2 = scannerObj.nextInt();
        int Array2[] = new int[length2];
        System.out.print("Enter 2nd Array : ");
        for (int i= 0 ; i< length2; i++)
            Array2[i] = scannerObj.nextInt();
        int concat[] = new int[length1+length2];
        System.arraycopy(Array1, 0 , concat , 0 ,length1);
        System.arraycopy(Array2, 0 , concat , length1 ,length2);
        System.out.println(Arrays.toString(concat)); 

    }
    
}
