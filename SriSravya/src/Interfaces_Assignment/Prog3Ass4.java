package Interfaces_Assignment;
import CarsforAss4Prog3.Cars;    //imported the file from other package

class Test implements Cars {            //interface 
       public void MaruthiSuzuki(){          //overriding methods of interface
        System.out.println("Swift");
    }
    public void Hyundai(){                 
        System.out.println("Creta");
    }
    public void Honda(){
        System.out.println("Honda City");
    }
}
public class Prog3Ass4{
    public static void main(String[] args) {
        Test obj=new Test();              //instance for subclass
        obj.MaruthiSuzuki();             //calling method
        obj.Hyundai();
        obj.Honda();
    }
}
