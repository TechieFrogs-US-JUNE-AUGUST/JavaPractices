import java.util.Arrays;
public class Array25DeepEqual{
    public static void main(String[] args){
        int array1[][] = { { 10, 20 }, { 40, 50 }, { 60, 70 } };
        int array2[][] = { { 30, 20,30}, { 10, 0 }, { 60, 80 } };
        int array3[][] = { { 10, 20 }, { 40, 50 }, { 60, 70 } };
        System.out.println("Check if a1 is equal to a2 : " + Arrays.deepEquals(array1, array2));
        System.out.println("Check if a2 is equal to a3 : " + Arrays.deepEquals(array2, array3));
        System.out.println("Check if a1 is equal to a3 : " + Arrays.deepEquals(array1, array3));
        // deepEquals(array1name, array2name); is used for multidimensional array
    }
}