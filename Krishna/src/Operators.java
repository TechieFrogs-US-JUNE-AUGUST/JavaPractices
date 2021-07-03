public class Operators {
    public static void main(String[] args) {
        int a=10;
        int b=40;
        int c= 60;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);      //a/b= -10/40 '/' prints quotient value= -0.25.
        System.out.println(a%b+" %%");      // why 10 is printed as output?
        System.out.println(50%30);    // why 20 is printed as output?
        System.out.println(a<<2);
        System.out.println(b>>3);    // b=40, b>>3 = 40/2^3 =40/8 =5 is quotient value.
        System.out.println(b>>4);    //b=40,  b>>4 = 40/2^4 =40/16=2.5 is quotient value.
                System.out.println(a<b && b==c);   // bad operand types for binary operator '&&' error is coming
        System.out.println(a>b || b>c);
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(--c);
        System.out.println(a+ " " +b+ " " +c);
        System.out.println(a&b);
        System.out.println(a|b);
    }
}
