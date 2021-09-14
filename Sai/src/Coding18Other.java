import java.util.Scanner;

public class Coding18Other {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter position of number in the series factor 2,3,5");
        int position = scannerObj.nextInt();
        int[] array=new int[position];
        int k = 2;
        array[0] = 1;
        for(int i = 1; i < position; i++){
           while((k % 2 != 0) && (k %3 != 0) && ( k % 5 != 0)){
               k++;
           }
           array[i]=k;
           k++;
        }
        System.out.println(array[position-1]);
        scannerObj.close();
    }
}
