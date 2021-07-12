package Inheritance;
class ClassA{
    int i,j;
    ClassA(){}
    void methodShow(int i,int j){
        System.out.println("The value of i="+i);
        System.out.println("The value of j="+j);
    }
}
class ClassB extends ClassA{
    int k;
    ClassB(){}
    void methodShow(int k){
        System.out.println("The value of k="+k);
    }
}
public class Classes {
    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.methodShow(2,4);
        obj.methodShow(5);
    }
}