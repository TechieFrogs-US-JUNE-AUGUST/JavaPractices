package Interface;
interface Prove
{
    int x=10;  // compiler will default take as public static final(public Static final int x=10)
    //int y;  //y maynot be  be initialized as they are constants
    public int z=100; //(public Static final int z=100)
}
interface Prove1
{
    int x=100;   //(public Static final int x=100)
    
}
public class Interface4 implements Prove,Prove1{
    public static void main(String[] args) {
       // System.out.println(x);  //As it is Ambiguous we are using interface names to resolve the variables
        System.out.println(Prove.x);
        System.out.println(Prove1.x);
        System.out.println(Prove.z);
        
    }
    
}
