public class CodingS19 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 101; i <= 1000 ; i =i+2){
            sum = sum + i;
            System.out.print(i + " ");
        }
        System.out.println("Sum of odd numbers in between 100 and 1000 = " + sum);
    }
}
