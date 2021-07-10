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
        Employee em1 = new Employee("Vijay",1997,"Gandhi nagar");
        Employee em2 = new Employee("Vinay",2000,"Teachers Colony");
        Employee em3 = new Employee("Eswar",1997,"Srinivas Nagar");


    }
    
}
