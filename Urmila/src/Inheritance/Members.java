package Inheritance;

 class Members {
    int age;
    int number;
    int salary;
    String name,Address;
    void printSalary(){
        System.out.println("Salary =" + salary);
    }
}
class Employee extends  Members{
        String Specialization;
    }
class Manager extends Members{
  String Department;
}
class AddMembers{
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.name = "Adwait";
        employee.age = 25;
        employee.number = 8771;
        employee.salary= 45000;
        Manager manager = new Manager();
        manager.name = "Himansh";
        manager.age= 35;
        manager.number= 0411;
        manager.salary= 70000;
        manager.Department = "abc";
        System.out.println("Employee name :"+ employee.name+"age :"+employee.age+"number:"+employee.number+"Address");
        employee.printSalary();
        System.out.println("Manager name:"+manager.name+"age:"+manager.age+"number:"+manager.number+"Address");
        manager.printSalary();
    }
}