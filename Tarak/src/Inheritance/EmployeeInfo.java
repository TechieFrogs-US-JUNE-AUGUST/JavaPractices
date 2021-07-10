package Inheritance;
class Member{
    String name,address;
    int age;
    long ph_no,salary;
    void printSalary(){
        System.out.println("Salary "+salary);
    }
}
class Employee extends Member{
       String specialization;
}
class Manager extends Member{
    String department;
}
public class EmployeeInfo {
    public static void main(String[] args) {
    System.out.println("Name     age     Ph_no     Address  Salary");
        Employee E=new Employee();
        E.name="Tarak";
        E.age=23;
        E.ph_no=7454566;
        E.address="India";
        E.salary=50000;
        System.out.println(E.name+"     "+E.age+"    "+E.ph_no+"   "+E.address+"     "+E.salary);
        Manager M=new Manager();
        M.name="Ram";
        M.age=23;
        M.ph_no=34737857;
        M.address="USA";
        M.salary=100000;
        System.out.println(M.name+"      "+M.age+"    "+M.ph_no+"    "+M.address+"      "+M.salary);
    }
}
