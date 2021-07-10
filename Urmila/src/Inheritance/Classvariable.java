package Inheritance;

 class A {
         int i =  25;
         int j =  15;
    A(){
             System.out.println("The value of i and j is "+ i + ""+ +j);
         }
         void show(){
             System.out.println("The vlaue of i and j is " + i + ""+ +j);
         }
}
class B extends A{
    int k = 50;
    B(){
    }
    void show(){
        System.out.println("The value of k" + k);
    }
}
class AddClassvariable{
    public static void main(String[] args){
        B b = new B();
        b.show();
    }
}