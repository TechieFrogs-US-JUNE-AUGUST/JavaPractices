public class PrintNumber {
    int print(int a){
        return a;
    }
    float print(float b){
        return b;
    }
    double print(double c){
          return c;
    }
    long print(long d){
        return d;
    }
    char print(char e){
        return e;
    }
    String print(String f){
        return f;
    }
    boolean print(boolean g){
        return g;
    }
    public static void main(String[] args){
        PrintNumber obj1=new PrintNumber();
        int a=obj1.print(3);
        System.out.println("integer value a="+a);
       float b= obj1.print(1.2f);
        System.out.println("float value b="+b);
       double c= obj1.print(23.567);
        System.out.println("double value c="+c);
        long d=obj1.print(1234567);
        System.out.println("long value d="+d);
        char e=obj1.print('d');
        System.out.println("character value c="+c);
        String f=obj1.print("Divya");
        System.out.println("String value f="+f);
        boolean g=true;
        System.out.println("boolean value g="+g);
    }

}
