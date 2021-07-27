package Arrays;
import java.util.Scanner;
public class Arrays23 {
    public static void identity(int arr[][]) {
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == j) && arr[i][j] != 1) {
                    result = false;
                    break;
                } else if ((i != j) && arr[i][j] != 0) {
                    result = false;
                    break;
                }
            }

        }
        if (result) {
            System.out.println("given matrix is identity");
        } else {
            System.out.println("given matrix is not identity matrix");
        }
    }
    public static void main(String[] args) {
        int arr1[][]=new int[3][3];
        Scanner s = new Scanner(System.in);
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr1[i].length;j++){
                    arr1[i][j]=s.nextInt();
                }
        }
            identity(arr1);
    }
}