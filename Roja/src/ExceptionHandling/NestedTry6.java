package ExceptionHandling;

public class NestedTry6 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        try {
            try {
                System.out.println(array[8]);
            }catch(ArrayIndexOutOfBoundsException aioe) {
                System.out.println("caught array index out of bound exception");
            }
            System.out.println(1/0);
        }catch(ArithmeticException ae) {
            System.out.println("Caught Arthmetic exception");
        }
    }
}
