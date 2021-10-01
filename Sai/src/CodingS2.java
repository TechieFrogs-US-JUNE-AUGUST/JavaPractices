import java.util.Scanner;

public class CodingS2 {    // product and sum of 2 arrays
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of 2nd array");
        int size2 = sc.nextInt();
        int array1[] = new int[size1];
        int array2[] = new int[size2];
        System.out.println("Give array1 list");
        for(int i = 0; i < size1 ; i++){
            array1[i] = sc.nextInt();
        }
        System.out.println("Give array2 list");
        for(int i = 0; i < size2 ; i++){
            array2[i] = sc.nextInt();
        }
        if(sumM(array1, size1)==sumM(array2, size2) && 
            productM(array1, size1)==productM(array2, size2)){
            System.out.println("Sum and Product of both arrays are equal");
        }else
            System.out.println("Not Equal");    
        sc.close();       
    }
    static int sumM(int array[], int size){
        int sum = 0;
        for(int i = 0 ; i < size ; i++ ){
            sum = sum + array[i];
            //product = product * array[i];
        }
        return sum;
    }
    static int productM(int array[], int size){
        int product = 0;
        for(int i = 0 ; i < size ; i++ ){
            product = product * array[i];
        }
        return product;
    }
}