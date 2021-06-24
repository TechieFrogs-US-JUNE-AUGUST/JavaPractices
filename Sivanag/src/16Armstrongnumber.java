import java.util.Scanner;

class armstrongnumber {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a =sc.nextInt();
        int b=a;
        int c=0;
        while(a>0)
        {
        int r= a % 10;
        c=c+(r*r*r);
        a=a/10;
        }
        if(b==c)
        System.out.println("Given Number is an Armstrong Number");
        else
        System.out.println("Given Number is not an Armstrong Number");
        sc.close();





    }

    
}
