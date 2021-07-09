/*class example extends Cars{       //child class extends with parent class cars
    }
public class MethodOverriding {
    public static void main(String[] args){
      example obj=new example();
      obj.display();                        //Output is 'In parent class method for method over riding'
    }
}   */



class example extends Cars{       //child class extends with parent class cars
    void display(){                         //overriding the method display in child class
        System.out.println("In child class method for method over riding");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
      example obj=new example();
      obj.display();                        //Output is 'In child class method for method over riding'
    }
}