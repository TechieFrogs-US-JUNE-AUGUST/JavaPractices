package oops;


class Employee{

    Employee()
    {
        System.out.println("Name " + "  " + "Year Of Joining " + "  " + "Address ");
    }

Employee(String name,int yoj,String address)
{
    System.out.println(name + " " + yoj + "  " + address);
}
}
public class EmployeeInfo10 {
    public static void main(String[] args) {
        Employee em=new Employee();
        Employee em1 = new Employee("Robert",1994,"64c-WallsStreat");
        Employee em2 = new Employee("Sam",2000,"68D WallsStreat");
        Employee em3 = new Employee("John",1999,"26B WallStreat");


    }
    
}
