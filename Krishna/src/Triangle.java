import java.lang.Math;
class Triangle
{
    //int a=3,b=4,c=5,p,s,A;              // declared as non-static can't be called in the main method.
    Triangle(){}
    public static void main(String[] args)
    {
       int a=3,b=4,c=5,p,s;
        double A;
        p=a+b+c;
        System.out.println("perimeter is " +p);
        s=p/2;
        A= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area is " +A);
    }
}