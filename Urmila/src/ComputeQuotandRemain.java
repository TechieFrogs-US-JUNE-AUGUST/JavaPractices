public class ComputeQuotandRemain 
{ 
    public static void main(String[] args)
    {
    int a = 20;            // declaring and initialize
    int b = 5;             // a= dividend,b= divisor
    int quotient = a / b;  // dividend/divisor
    int remainder= a % b;  //dividend % divisor
    System.out.println("Quotient is "+ quotient );//print the quotient and remainder
    System.out.println("Remainder is " + remainder);
    }
}