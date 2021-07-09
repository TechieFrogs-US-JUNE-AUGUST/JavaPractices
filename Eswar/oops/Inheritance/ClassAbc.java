package oops.Inheritance;
class ClassA{
int i,j;
ClassA(){
i=100;
j=200;
}
void show(){
    System.out.println(i+" "+j);
}
}
class ClassB extends ClassA{
int k;
ClassB(){
k=10;
}
void show(){
System.out.println(k);
}
}
public class ClassAbc {
    public static void main(String[] args) {
        ClassB obj=new ClassB();
        obj.show();
    }
}
