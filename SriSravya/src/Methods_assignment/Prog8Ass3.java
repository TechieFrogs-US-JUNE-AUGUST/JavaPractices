package Methods_assignment;
class A1{                 //parent class
    void show(){          //method
        System.out.println("Parent");
    }
}
class B1 extends A1{       //subclass with inheritance
    void show1(){          //method
        System.out.println("Child");
    }
}

public class Prog8Ass3 {
    public static void main(String[] args){
        B1 obj1=new B1();
        obj1.show1();
        A1 obj2=new A1();
        obj2.show();
        A1 obj=new B1();        //calling method by using obj of parent referring to child 
        obj.show();
    }
}
