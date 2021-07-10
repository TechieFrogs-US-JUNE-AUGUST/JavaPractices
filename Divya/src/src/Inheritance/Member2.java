package Inheritance;
class Member {
    int age,phone_number,salary;
    String name,address;
    void printSalary(int salary) {
        System.out.println("salary:" + salary);
    }
}
class Employee extends Member {
    String specialization;
}
class Manager extends Member {
    String department;
}
public class Member2{
    public static void main(String[] args) {
        System.out.println("employee details");
        Employee obj1 = new Employee();
        obj1.name = "john";
        obj1.age = 22;
        obj1.phone_number = 123456;
        obj1.address = "visakhapatnam";
        obj1.specialization = "EEE";
        System.out.println("name:\t" + obj1.name + "\tage:" + obj1.age + "\tphone_number:" + obj1.phone_number + "\taddress:" + obj1.address + "\tspecialisation:" + obj1.specialization);
        obj1.printSalary(123455);
        System.out.println("Manager details");
        Manager obj2 = new Manager();
        obj2.name = "sam";
        obj2.age = 23;
        obj2.phone_number = 1234556;
        obj2.address = "visakhapatnam";
        obj2.department = "xxx";
        System.out.println("name:\t" + obj2.name + "\tage:" + obj2.age + "\tphone_number:" + obj2.phone_number + "\taddress:" + obj2.address + "\tspecialisation:" + obj2.department);
        obj2.printSalary(1234566);
    }
}
