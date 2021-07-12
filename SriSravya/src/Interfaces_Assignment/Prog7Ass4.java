package Interfaces_Assignment;
//import AbstractClass_Assignment.*;
import CarsforAss4Prog3.*;

public class Prog7Ass4 extends ref2_ass4Prog7{           //inheritance
        public static void main(String[] args) {
            ref2_ass4Prog7 obj=new ref2_ass4Prog7();              //outerclass instance
            ref2_ass4Prog7.Innerclass obj1=obj.new Innerclass();  //innerclass instance 
            obj1.one();                                        //calling the method with obj1 of innerclass
           }
        }