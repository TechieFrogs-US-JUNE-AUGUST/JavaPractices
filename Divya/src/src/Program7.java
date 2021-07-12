class A {
    int i;
    void printNum() {
        System.out.println("the value of i"+i);
    }
}
     class subClass extends A {
         int j;
         void printNum() {
             System.out.println("value of j=" + j);
         }
     }
       public class Program7{
    public static void main(String[] args) {
        subClass obj=new subClass();
        obj.i=6;
        obj.j=5;
        obj.printNum();
    }
}