//DEFAULT CONSTRUCTOR
/*class Car{
        String name="Sravya";
        //void practice(){
          //  System.out.println("In SubClass");  
        Car(){
            System.out.println("In Constructor");
        }
    }
  public class Constructors {
    int i=5;

    public static void main(String[] args){
      //  Constructors s=new Constructors();
       // System.out.println(s.i);
        Car obj =new Car();
    }
}   */



//PARAMETRIZED CONSTRUCTOR

/*class Car{
    int n;

 //Car(int a){
       // System.out.println("Value is "+a);  
   // }
    Car(int a, String b){
        System.out.println("Value is "+a+"   and  "+ "String is "+b);  
    }
}
public class Constructors{
    public static void main(String[] args){
        Car obj=new Car(10, "Sravya");
    }
}   */


//CONSTRUCTOR OVERLOADING

/* class Car{
    int a=20;
    Car(int a){
        this.a=a+100;             //we can change the int value in this constructor using ' this. '
        System.out.println("a value is " +this.a);
        System.out.println("This is Car");
    }
    Car(int a,String b){
        System.out.println(+a+" and "+b);
    }
    Car(int a, String b, int c){
        System.out.println(+a+" and "+b+" and "+c);
    }     
}
public class Constructors{
    public static void main(String[] args){
        Car obj=new Car(10);
        Car obj1=new Car(20,"SriSravya");
        Car obj2=new Car(30,"Sravya",40);
    }
}  */ 



//CONSTRUCTOR CHAINING
class Car{
    Car(int a){
        this(20,"Sravya");                   //we can use this(); and call any other constructor also we can only use this(); once
       // System.out.println("This is Car");
    }
    Car(int a,String b){
        this(10,"Java",20);
        System.out.println(+a+" and "+b);
    }
    Car(int a, String b, int c){
        System.out.println(+a+" and "+b+" and "+c);
    }     
}
public class Constructors{
    public static void main(String[] args){
        Car obj=new Car(10);
      //  Car obj1=new Car(20,"SriSravya");
       // Car obj2=new Car(30,"Sravya",40);
    }
}  

