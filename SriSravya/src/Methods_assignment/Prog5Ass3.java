package Methods_assignment;
class Degree{               //parent class
    void getDegree(){
        System.out.println("I got a Degree");
    }
}                                           
    class Undergraduate extends Degree{                      //creating subclass and using inheritance with parent class Degree
        void undergraduate(){                              
            System.out.println("I am an Undergraduate");
        }
    }
     class Postgraduate extends Degree{                     //creating subclass postgraduate
        void postgraduate(){
            System.out.println("I am a Postgraduate");
        }
    }

public class Prog5Ass3 {
    public static void main(String[] args){
       Undergraduate obj1=new Undergraduate();               
       obj1.undergraduate();                            //calling method using obj
       Postgraduate obj2=new Postgraduate();
       obj2.postgraduate();
    }
}
