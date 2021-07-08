class Method{
    int n=10;
    char c='T';
    void Method2(int n, char c)
    {
        System.out.println(n+ " "+c);
    }
    void Method2(char c,int n){
        System.out.println(c+ " "+n);
    }
}
public class Methods2 {
    public static void main(String[] args) {
        Method obj= new Method();
        obj.Method2(10, 'T');
        obj.Method2('T', 10);
    }
}
