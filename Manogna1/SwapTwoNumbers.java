public class SwapTwoNumbers {
    public static void main(String[] args) {
        int number1=100;
        int number2=300;
        System.out.println(" Before Swap ");
        System.out.println("First Number" +number1);
        System.out.println("Second Number " +number2);
        int temporary=number1;
         number1=number2;
         number2=temporary;
         System.out.println(" After Swap ");
         System.out.println("First Number " +number1);
         System.out.println("Second Number " +number2);



    }
}
