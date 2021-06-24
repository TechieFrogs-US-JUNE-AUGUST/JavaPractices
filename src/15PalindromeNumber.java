import java.util.Scanner;

class PalindromeNumber {
    public static void main(String args[])
        {   
            Scanner sc =new Scanner(System.in); //new scanner

            System.out.println("Enter Number : ");
            int n=sc.nextInt(); //input numberr
            int m=n;//input tranfer to  variable m
            int rv=0;//Reverse number
            int rm;//remainder
            while(n !=0)
            {
                rm =n %10;      
                rv =(rv *10)+rm;
                n/=10;


            }
            if(rv==m)
            System.out.println("Given Number is a Palindrome Number");
            else
            System.out.println("Given Number is not a Palindrome Number");

            sc.close();
        }

    
}
