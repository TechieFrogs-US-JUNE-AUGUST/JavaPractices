class Employee{
Employee()
{
    System.out.println("Name " + "        " + "Year Of Joining " + "        " + "Address ");
}

Employee(String name,int yoj,String address)
{
System.out.println(name + "         " + yoj + "                    " + address);
}
}
public class EmployeeInfo {
    public static void main(String[] args) {
        Employee emp=new Employee();
        Employee emp1 = new Employee("Robert",1994,"64c-WallsStreat");
        Employee emp2 = new Employee("Sam",2000,"68D WallsStreat");
        Employee emp3 = new Employee("John",1999,"26B WallStreat");
    }
    
}
