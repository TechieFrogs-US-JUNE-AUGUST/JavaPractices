import java.util.Scanner;
public class Complex 
{
    int complexNumber;
    int sum;
    int difference;
    int multiplication;
    public static void main(String[] args)
    {
        complexNumber c1=new complexNumber(2,4);
        complexNumber c2=new complexNumber(3,5);
        complexNumber sum=c1.sum(c2);
        complexNumber difference=c1.difference(c2);
        complexNumber multiplication=c1.multiplication(c2);
        System.out.println("first complex number is"+c1);
        System.out.println("second complex number is"+c2);
        System.out.println("sum is"+sum);
        System.out.println("difference is"+diiference);
        System.out.println("multiplication is"+multiplication);
}
    }
