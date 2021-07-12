package Inheritance;

public class Member
{
    int Age, salary;
    int phonenumber;
    String Name, Address;
    void printSalary()
    {
        System.out.println("salary is " +salary);
    }
    public static void main(String[] args)
    {
        Employee Obj= new Employee();
        Obj.Name="Rama";
        Obj.Age= 25;
        Obj.phonenumber=1234567;
        Obj.salary=50000;
        Obj.Address="abc street";
        Obj.specialization="B.tech- E.C.E";
        System.out.println("Employee Name: "+Obj.Name+ " age: "+Obj.Age+ " phonenumber: "+Obj.phonenumber+ " salary: "+Obj.salary+ "Address: "+Obj.Address+ "specialization: " +Obj.specialization);
        Manager Obj1= new Manager();
        Obj1.Name="Krishna";
        Obj1.Age= 27;
        Obj1.phonenumber=809697467;
        Obj1.salary=100000;
        Obj1.Address="def street";
        Obj1.department="sales";
        System.out.println("Manager Name: "+Obj1.Name+ " age: "+Obj1.Age+ " phonenumber: "+Obj1.phonenumber+ " salary: "+Obj1.salary+ "Address: "+Obj1.Address+ "specialization: " +Obj1.department);
    }
}
    class Employee extends Member
    {
        String specialization;
    }
    class Manager extends Member
    {
        String department;
    }
    
