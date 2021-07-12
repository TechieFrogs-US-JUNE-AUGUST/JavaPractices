
interface Example{
    int a=10;     //the default syntax will be 'public static final a=10 '  
    static int b=20;
    final int c=30;
}
interface Example1{
    int a=15;
    int b=25;
}
public class Prog4Ass4 implements Example,Example1{       //interface implementing
    public static void main(String[] args){
       System.out.println(Example.a);           //we can access them by using 'interfacename.variable'
       System.out.println(Example1.a);
       System.out.println(Example.b);
       System.out.println(Example1.b);
       System.out.println(Example.c);
    }
}
