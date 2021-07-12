import java.util.Scanner;              // Scanner package
 class Complex1{                       // sub class name
    float real,img;             //complex number is in the form of=(a+ib),here a is real part and b is imaginary part
    Complex1(){}                   // created default constructor to store result of addition of two complex numbers
    Complex1(float real,float img){            //parametrized constructor
     this.real=real;               // this keyword if instance and local variables names are same
     this.img=img;
    }
    Scanner s=new Scanner(System.in);            // created Scanner object to print values from the keyboard
    void Complex1(){                         //complex1 method to print real and imaginary parts of two complex numbers
        System.out.println("enter real number");
        real=s.nextFloat();
        System.out.println("enter imaginary number");
        img=s.nextFloat();
    }
    void display(){
        System.out.println(real+"+i"+img);
    }  //to display the values created display method
               //addition of two complex numbers
     Complex1 add(Complex1 c2){
        Complex1 res=new Complex1();
        res.real=real+c2.real;
        res.img=img+c2.img;
        return(res);
    }
               // subtraction of complex numbers
     Complex1 sub(Complex1 c2){
         Complex1 res=new Complex1();
         res.real=real-c2.real;
         res.img=img-c2.img;
         return(res);}
              //multiplication of complex numbers
     Complex1 mul(Complex1 c2){
         Complex1 res=new Complex1();
         res.real=real*c2.real;
         res.img=img*c2.img;
         return(res);}
}
class Complex{                                        // main class
    public static void main(String[] args){              //main method
        Complex1 c1=new Complex1();            //object creation for class complex1
        Complex1 c2=new Complex1();
        System.out.println("enter first complex number");
        c1.Complex1();
        System.out.println("enter second complex number");
        c2.Complex1();
        System.out.println("c1 is:");
        c1.display();
        System.out.println("c2 is:");
        c2.display();
        Complex1 c3=new Complex1();
        c3=c1.add(c2);
        System.out.println("addition of c1 and c2 :");
        c3.display();
        c3=c1.sub(c2);
        System.out.println("subtraction of c1 and c2:");
        c3.display();
        c3=c1.mul(c2);
        System.out.println("multiplication of c1 and c2");
        c3.display();
    }
}

