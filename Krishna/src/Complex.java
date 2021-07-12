import java.util.Scanner;

class Complex
{
    double real;
    double img;
    Complex(){}
    public Complex(double real,double img)
    {
        this.real=real;
        this.img=img;
    }
    void add(Complex c1,Complex c2)
    {
        Complex c=new Complex();
        c.real=c1.real+c2.real;                
        c.img=c1.img+c2.img;                 
        System.out.println("sum of complex num is" +c.real+"+"+c.img+"i");
    }
    void difference(Complex c1,Complex c2)
    {
        Complex c=new Complex();
        c.real=c1.real-c2.real;
        c.img=c1.img-c2.img;
        System.out.println("difference of complex num is" +c.real+"+"+c.img+"i");
    }
    void Product(Complex c1,Complex c2)
    {
        Complex c=new Complex();
        c.real=(c1.real*c2.real)-(c1.img*c2.img);
        c.img=(c1.img*c2.real)+(c1.real*c2.img);
        System.out.println("product of complex num is" +c.real+"+"+c.img+"i");
    }
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First complex num");
        System.out.println("Enter real number :");
        double r1=sc.nextInt();
        System.out.println("Enter imaginary number");
        double i1=sc.nextInt();
        System.out.println("Enter Second complex num");
        System.out.println("Enter real num :");
        double r2=sc.nextInt();
        System.out.println("Enter img num :");
        double i2=sc.nextInt();
        Complex c1=new Complex(r1,i1);
        Complex c2=new Complex(r2,i2);
            c2.add(c1, c2);
            c2.difference(c1, c2);
            c2.Product(c1, c2);
    }
}