package OOPS;
class Employee
{

    Employee()
    {
        System.out.println("Name " + "    " + "Year of Joining" + "    " + "Address") ;
    }
    Employee(String name,int yj,String address)

    {
        System.out.println(name + "    " + yj + "    " + address) ;
    }
}
public class PrintInfoStrudent {
    public static void main(String[] args) {
    Employee obj = new Employee();
    Employee objj = new Employee("Robert",1994,"64C-WallsStreat");
    Employee obj1 = new Employee("Sam",2000,"68D-WallsStreat");
    Employee obj2= new Employee("John",1999,"26B-WallsStreat");
}
}
