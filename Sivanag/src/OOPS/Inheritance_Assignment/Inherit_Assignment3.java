package Inheritance_Assignment;


class Member
{
    String Name;
    int Age;
    String pno;
    String Address;
    int Salary;
    void printSalary()
    {
        System.out.println("Salary is " + Salary);
    }
}
class Employee extends Member
{
    String Specialization;
}
class Manager extends Member{
    String department;
}

public class Inherit_Assignment3 {
    public static void main(String[] args) {
        Employee eobj = new Employee();
        Manager mobj =new Manager();
        eobj.Name ="Siva";
        eobj.Age =35;
        eobj.pno = "8184811657";
        eobj.Address="Hyderabad";
        eobj.Salary =40000;
        eobj.Specialization ="Programmer";
        mobj.Name ="Anu";
        mobj.Age =32;
        mobj.pno = "8184811689";
        mobj.Address="Hyderabad";
        mobj.Salary =50000;
        mobj.department="IT";
        System.out.println("Employee Name : " +eobj.Name + "\nEmployee Age : " +eobj.Age + "\nEmployee Phone No: " + eobj.pno + "\nEmployee Address : " +eobj.Address +"\nEmployee Specilization : "+eobj.Specialization);
        eobj.printSalary();
        System.out.println("Manager Name : " +mobj.Name + "\nManager Age : " +mobj.Age + "\nManager Phone No: " + mobj.pno + "\nManager Address : " +mobj.Address+"\nManager Department :" +mobj.department);
        mobj.printSalary();
       
    }
 }
