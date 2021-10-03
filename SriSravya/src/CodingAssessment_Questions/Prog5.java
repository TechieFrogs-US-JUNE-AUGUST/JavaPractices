// Program to count all perfect numbers between 5000 to 9000.
//Perfect num means its sum of divisors is equal to the number eg: 6 = 1+2+3 which is 6 i.e, 6=6(perfect num)

package CodingAssessment_Questions;

public class Prog5 {
    static boolean isPerfect(int n){      //method that calculates if the num is perfect
        int sum= 1;                       //stores the sum of divisors
        for(int i=2; i*i <= n; i++){      //for finding all divisors and adding them
            if(n%i == 0){
                if(i * i != n)
                sum= sum + i+n/i;
                else
                sum= sum + i;
            }
        }
        if(sum == n && n!=1){              //if the sum of divisors is equal to n then n is a perfect num
            return true;                   //returns true if n is perfect
        }
        return false;                      //returns false if n is not perfect
    }
    public static void main(String[] args) {
        System.out.println("Below are the perfect numbers in between 5000 and 9000: ");
        for(int n=5000; n<=9000; n++){                         //for loop to get the perfect num in betweeb 5000 and 9000
            if(isPerfect(n))                                   //condition that calls method by passing 'n' value
            System.out.println(n + " is a perfect number");
        }
    }
}
