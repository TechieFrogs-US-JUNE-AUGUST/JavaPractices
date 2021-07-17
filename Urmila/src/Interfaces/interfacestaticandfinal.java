package Interfaces;

interface  interfacestaticandfinal{
    int a=5;       
    static int b=10;
    final int c=20;
}
interface Examples{
    int a=25;
    int b=35;
}
class Addinterfacestaticandfinal {       //interface implementing
    public static void main(String[] args){
       System.out.println(Examples.a);           // accessing  'interfacename.variable'
       System.out.println(Examples.a);
       System.out.println(Examples.b);
       System.out.println(Examples.b);
    }
}