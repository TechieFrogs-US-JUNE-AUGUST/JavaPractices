package Methods;

class I{
    int i;
    void printNum(){
    System.out.println(i);
    }
}
class J extends I{
    int j;
    void printNum(){
         super.printNum();
        System.out.println(j);
    }
}
public class Integer {
    public static void main(String[] args) {
        J obj=new J();
        obj.i=10;
        obj.j=20;
        obj.printNum();
    }
}
