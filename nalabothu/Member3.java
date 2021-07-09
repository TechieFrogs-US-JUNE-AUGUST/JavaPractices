public class Member3 
{
    String name;
    int age;
    int phnumber;
    String address;
    int salary;
    public static void main(String[] args)
{
    Member3 m=new Member3();
    Employee e=new Employee();
    manager g=new manager();
    e.name="nag";
    m.printSalary(20000);
    e.age=20;
    e.phnumber=9553;
    e.address="1252 henderson ave";
    e.salary=200000;
    g.name="nag";
    g.age=20;
    g.phnumber=9553;
    g.address="1252 henderson ave";
    g.salary=200000;
    System.out.println("emplyee name is "+e.name);
    System.out.println("emplyee age is "+e.age);
    System.out.println("emplyee phnumber  is "+e.phnumber);
    System.out.println("emplyee salary is "+e.salary);
    System.out.println("emplyee address is "+e.address);
    System.out.println("emplyee name is "+g.name);
    System.out.println("emplyee ageis "+g.age);
    System.out.println("emplyee phnumber is "+g.phnumber);
    System.out.println("emplyee address is "+g.address);
    System.out.println("emplyee salary is "+g.salary);
    
}
public void printSalary(int salary)
    {
        System.out.println("salary is "+salary);
    }
    }
class Employee extends Member3
{
    String specialization;
    String department;
}
class manager extends Member3
{
    String specialization;
    String department;
}




