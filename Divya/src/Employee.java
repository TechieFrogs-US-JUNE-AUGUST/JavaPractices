public class Employee {                     //main class
    String name;
    int year;                                     // variables declaration
    String address;
    Employee(String n,int y,String a){                //default  constructor
        name=n;
        year=y;
        address=a;
    }
    void display(){                       // method to display values
        System.out.println(name+"     "+year+"       "+address);
    }
    public static void main(String[] args){                   // main method
        Employee obj1=new Employee("robert",1994,  "64C_WallsStreet");
        Employee obj2=new Employee("Sam",   2000,  "68D_WallsStreet");
        Employee obj3=new Employee("John",  1999,  "26B_WallsStreet");
        System.out.println("name         year         address");
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
