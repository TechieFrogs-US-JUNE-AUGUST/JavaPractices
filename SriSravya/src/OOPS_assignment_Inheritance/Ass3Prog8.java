package OOPS_assignment_Inheritance;
class A{
    int i,j;
    A(int a,int b){          //constructor with parameters
        this.i=a;
        this.j=b;
    }
    void show(){
        System.out.println("i and j:" +i+" "+j);
    }
}
class B extends A{                      //inheritance
    int k;
    B(int a,int b,int c){             //constructor with parameters
        super(a,b);                //using super to use the parent class obj,mem,constructors
        k=c;
    }
    void show(){              //overriding the show() method of class A
        System.out.println("k: " +k);
    }
}
public class Ass3Prog8 {
    public static void main(String[] args){
        B obj=new B(1,2,3);
        obj.show();
    }
}
