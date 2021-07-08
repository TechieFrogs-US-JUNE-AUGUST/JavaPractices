import java.util.Scanner;

class Complex{
    double real;
    double img;
    Complex(){}                 //default constructor for storing real and img values of object c
    public Complex(double real,double img){        //method 
        this.real=real;
        this.img=img;
    }
    void add(Complex c1,Complex c2){            //Addition method
        Complex c=new Complex();         //using object c for storing the add result
        c.real=c1.real+c2.real;
        c.img=c1.img+c2.img;
        System.out.println("Sum of complex numbers is " +c.real+ "+" +c.img+ "i");
    }
    void difference(Complex c1,Complex c2){      //Difference method
        Complex c=new Complex();
        c.real=c1.real-c2.real;
        c.img=c1.img-c2.img;
        System.out.println("difference of complex numbers is " +c.real+ "+" +c.img+ "i");
    }
    void Product(Complex c1,Complex c2){        //Product method
        Complex c=new Complex();
        c.real=(c1.real*c2.real)-(c1.img*c2.img);
        c.img=(c1.img*c2.real)+(c1.real*c2.img);
        System.out.println("product of complex numbers is " +c.real+ "+" +c.img+ "i");
    }
}
public class Complex9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    System.out.println("Enter First complex num");
    System.out.println("Enter real number :");
    double r1=s.nextInt();
    System.out.println("Enter imaginary number");
    double i1=s.nextInt();
    System.out.println("Enter Second complex num");
    System.out.println("Enter real num :");
    double r2=s.nextInt();
    System.out.println("Enter imagnary num :");
    double i2=s.nextInt();
    Complex c1=new Complex(r1,i1);         //created object c1 by passing values
    Complex c2=new Complex(r2,i2);
    c1.add(c1, c2);                     //calling method with reference values, we can also use c2.add(c1,c2)
    c1.difference(c1, c2);
    c1.Product(c1, c2);
    }  
}
    
