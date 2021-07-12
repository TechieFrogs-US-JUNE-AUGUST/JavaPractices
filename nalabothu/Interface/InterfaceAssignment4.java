package Interface;

interface StaicFinal {
    int a = 100;
    int b = 10; // by default it is taking as static and final because throwing an error if we
                // are not initializing            
}

public class InterfaceAssignment4 implements StaicFinal {
    public static void main(String[] args) {
        int a = 200;
        System.out.println(a);
        InterfaceAssignment4 i = new InterfaceAssignment4();
        System.out.println(+i.a);
        System.out.println(+i.b);
    }
}
