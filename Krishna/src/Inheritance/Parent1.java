package Inheritance;

 class parent
 {
     void display()              // method 1
     {
        System.out.println("This is parent class");
     }
 }
 class child extends parent
 {
     void display1()             // method 2
     {
         System.out.println("This is child class");
     }
 }
 public class Parent1 {
    public static void main(String[] args)
    {
        parent obj= new parent();
        obj.display();
        child obj1 = new child();
        obj1.display1();
        obj1.display();
    }
 }