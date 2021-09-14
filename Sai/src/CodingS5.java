public class CodingS5 {
    static boolean perfectNumber(int n){
        int sum = 1 ;                                        
        for (int i = 2;  i*i <= n; i++){  // Finding all divisors and add them
            if (n % i == 0){
                if(i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
         // If sum of divisors is equal to number, that number is a perfect number
        if (sum == n && n != 1){
            return true;
        }
        
        return false;
    }   
    public static void main (String[] args){
        System.out.println("Below are perfect number in between 5000 and 9000");
        for (int n = 5000; n < 9000; n++){
            if (perfectNumber(n))
                System.out.println( n +" is a perfect number");
        }
    }
}
