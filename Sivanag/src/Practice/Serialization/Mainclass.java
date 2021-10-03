public class mainclass {
    public static void main(String[] args) {
        address a1=new address();
        a1.setAdd("hyd");
        class1 c1= new class1();
        c1.setEno(100);
        c1.setEname("Sivanag");
        c1.setAdd(a1);
        c1.dis();

    }

    
}
