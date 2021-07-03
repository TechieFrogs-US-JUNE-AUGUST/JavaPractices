public class PrimeNumbers{
    public static void main(String[] args) {

        int num=3, i=2;
        boolean count = false;
        while(i<=num/2) {
            if(num % i == 0) {
                count = true;
                break;
            }++i;
        }if (!count)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}