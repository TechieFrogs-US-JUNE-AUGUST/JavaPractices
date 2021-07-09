
class New1
{
    int ll;
    String ss="Name";
    
}
public class OBJCLASS {
    int k;
    int m;
    static int s;
    void methodcj(){
        System.out.println("mathod Inside");
    }
    public static void main(String[] args)
     {
        New1 n = new New1();
        System.out.println(n.ss);
        OBJCLASS ob= new OBJCLASS();
        ob.k=100;
        ob.m=20;
        OBJCLASS.s =60;
        System.out.println(ob.k + ob.m + OBJCLASS.s);
        ob.methodcj();
        OBJCLASS ob1= new OBJCLASS();
        ob1.k=900;
        ob1.m=10;
        OBJCLASS.s =320;
        System.out.println(ob.k + ob.m + OBJCLASS.s);
        System.out.println(ob1.k + ob1.m + OBJCLASS.s);
        ob1.methodcj();


    }


}
