package OOPS_assignment_Inheritance;
class Member{              //parent class
    String name;
    int age;
    int number;
    String address;
    int salary;

void Salary(){                     //method to print salary
    System.out.println(salary);
 }
}
class Employee extends Member{         //inheritance 
    String specialization;
}
class Manager extends Member {
    String department;
}
public class Ass3Prog3 {
    public static void main(String[] args){
        Employee emp=new Employee();
        emp.name="Sam";
        System.out.println(emp.name);
        emp.age=21;
        System.out.println(emp.age);
        emp.number=12345;
        System.out.println(emp.number);
        emp.address="Wellsburg Sam Villa";
        System.out.println(emp.address);
        emp.salary=25000;
        System.out.println(emp.salary);
        emp.specialization="System Analyst";
        System.out.println(emp.specialization);

        Manager mng=new Manager();
        mng.name="David";
        System.out.println();
        System.out.println(mng.name);
        mng.age=45;
        System.out.println(mng.age);
        mng.number=67890;
        System.out.println(mng.number);
        mng.address="David Villa Wellsburg";
        System.out.println(mng.address);
        mng.salary=50000;
        System.out.println(mng.salary);
        mng.department="IT";
        System.out.println(mng.department);
    }
}
