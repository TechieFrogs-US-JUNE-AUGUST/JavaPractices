class PrintNumbers1{
    int a = 10;
        short b=25;
        boolean s=true;
        String name= "Tarak";
        char ch='N';
public int printn(){
  return a;
}
protected boolean printn(int a){
    return s;
}
 String printn(String name){
        return name;
}
char printn(boolean a){
    return ch;
}
}
public class PrintNumber {
    public static void main(String[] args) {
         PrintNumbers1 obj=new PrintNumbers1();

System.out.println(obj.printn());
System.out.println(obj.printn(5));
System.out.println(obj.printn("Tarak"));
System.out.println(obj.printn(false));
    }
    
}
