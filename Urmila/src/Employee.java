public class Employee {
int year, salary;
String name, address;
public  Employee(String name, int year, int salary ,String address){
    name = name;
    year = year;
    salary = salary;
    address = address;
}
public String getName(){
    return name;
}
public int getYear(){
    return year;
}
public int getSalary(){
    return salary;
}
public String getAddress(){
    return address;
}
}
class AddEmployee{
    public static void main(String[] args){
    Employee e1 = new Employee("Robery",1994,500000,"64C-WallStreet");
    Employee e2 = new Employee("Sam",2000,740000,"68D-WallStreet");
    Employee e3 = new Employee("John", 1999,600000,"26B-WallStreet");
    System.out.println("Name\tYear of joining\tSalary\tAddress");
System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getSalary()+"\t"+e1.getAddress());
//printing details of employee
System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t"+e2.getAddress());
System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t"+e3.getAddress());
}
}