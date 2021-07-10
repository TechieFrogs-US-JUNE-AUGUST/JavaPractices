import java.util.Scanner;

class Complex
{
    int rr,ii;
    Complex()
    {

    }
    Complex(int trr,int tii)
    {
        rr=trr;
        ii=tii;

    }
    void sum(Complex a,Complex b)
    {
        Complex temp =new Complex();
        temp.rr = a.rr+b.rr;
        temp.ii =a.ii+b.ii;
        System.out.println("Sum of two complex number is : " +(temp.rr + "+" + temp.ii +"i"));
        

    }
    void diff(Complex a,Complex b)
    {
        Complex temp =new Complex();
        temp.rr = a.rr-b.rr;
        temp.ii =a.ii-b.ii;
        System.out.println("Sum of two complex number is : " +(temp.rr + "+" + temp.ii +"i"));

    }
    void product(Complex a,Complex b)
    {
        Complex temp =new Complex();
        temp.rr = a.rr*b.rr;
        temp.ii =a.ii*b.ii;
        System.out.println("Sum of two complex number is : " +(temp.rr + "+" + temp.ii +"i"));


    }

}
public class Opps_A9_ComplexNumbers_Operations {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Real part number ; ");
        int r = sc.nextInt();
        System.out.println("Enter First Imaginary part number ; ");
        int i = sc.nextInt();
        System.out.println("Enter Second Real part number ; ");
        int r1 = sc.nextInt();
        System.out.println("Enter Imaginary part number ; ");
        int i1 = sc.nextInt();
        Complex c1 =new Complex(r,i);
        Complex c2 =new Complex(r1,i1);


        c2.sum(c1, c2);
        c2.diff(c1, c2);
        c2.product(c1, c2);


        sc.close();

        
    }
    
}
