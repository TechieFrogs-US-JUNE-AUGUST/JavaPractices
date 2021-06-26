public class Variable {
    final static int c = 30;
    private static int n;
     static {int n = 5;}
    static int a = 10;
    static int b = 20;
    public static void main(String[] args) {
                    //Variable smapleObj = new Variable();
            System.out.println(a++ + ++b);
            System.out.println(a);
            System.out.println(b);
            System.out.println(++b - --a);
            System.out.println(c + a);
            System.out.println(c);
            System.out.println(~c);
            System.out.println(c);
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
            System.out.println(~a);
            System.out.println(~b);
            boolean d = false;
            boolean e = true;
            System.out.println(!d);
            System.out.println(!e);
            String m = " Rama krishna";
            System.out.println("My name is" + m);
            System.out.println(m.length());
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(n);
            System.out.println(a & b);
            System.out.println(a | b);
    }
}
