package ExceptionHandling;

public class OverloadedMethodException8 {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        String s = "test";
        
        OverloadedMethodException8 overloadedMethodException8 = new OverloadedMethodException8();
        overloadedMethodException8.m1(a,b,s);
        overloadedMethodException8.m1(a,s);

    }
   
    void m1(int a, int b, String c){

    }

    void m1(int a, String c){
        
    }
}
