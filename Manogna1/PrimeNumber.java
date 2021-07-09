public class PrimeNumber {
    public static void main(String[] args) {
        int n = 21;
        int i;
        boolean flag=false;
        //if (n == 2)
           // System.out.println("This is Even Prime");
        //else {
            for (i = 2; i <= n / 2; ++i )
                {
                    if (n % i == 0) {

                        flag = true;
                        break;
                    }
                }
                if(!flag)

                    System.out.println("Is A Prime Number");
                else
                    System.out.println("Not a Prime Number");




        }
    }



