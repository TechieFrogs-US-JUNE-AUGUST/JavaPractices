package tcscodingquestions;

public class Assignment13 {
    public static void main(String[] args) {
        int a=0,b=0;
        int n=15;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                a=a+7; //for odd numbers
                //System.out.println( n +"th term is " + a); // to print the 15th term

            }
            else
            {
                b=b+6; // for even numbers
            }
             
        }
        System.out.println( n +"th term is " + (a-7)); // to print the 15th term
    }
    
}
