package Inheritance;
class Parent {
    void display1(){
        System.out.println("this is parent class");
    }
}
class B extends Parent {
    void display() {

        System.out.println("this is child class");
    }

    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.display1();
        B obj2 = new B();
        obj2.display();
        Parent obj3 = new B();
        obj3.display1();
    }
}
