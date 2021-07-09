package Inheritance;

class Member
{
    String name,address;
    int age,number,salary;

    void printSalary(){
        System.out.println("Salary : " +salary);
    }
}
class Employee extends Member
{
    String Specialization;
}
class Manager extends Member
{
    String Department;

}

public class InheritanceAssignment3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name="Sam";
        e.age=20;
        e.number=9875;
        e.address="Vja";
        e.salary=30000;
        e.Specialization="xyz";
        Manager m = new Manager();
        m.name="Nag";
        m.age=25;
        m.number=987665;
        m.address="Hyd";
        m.salary=40000;
        m.Department="zyx";
        System.out.println("Employee Name :" +e.name + " Age :" +e.age + " Number : " +e.number + " Address :" +e.address + " Salary: " +e.salary + " Specialization: " +e.Specialization);
        e.printSalary();
        System.out.println("Manager Name :" +m.name + " Age :" +m.age + " Number : " +m.number + " Address :" +m.address + " Salary: " +m.salary + " Department: " +m.Department);
        m.printSalary();
    }
    
}
