class Member{
    String name , phone, address;
    int salary, age;
    public void print(){
        System.out.println(name + " "+ age + " "+ salary + " "+ phone + " "+ address);
    }
}
class Employee1 extends Member{ //in subclass i used to give the employee but java alredy had employee class.i added 1 to the name
    String specialization;    // data member
}
class Manager extends Member{
    String Department;    // data member
}
class Office{
    public static void main(String[] args){
        Employee1 e = new Employee1(); // 
        e.name= "Kkkkk";
        e.phone = "1234567890";
        e.address = "Street city";
        e.salary = 9000;
        e.age = 6;
        Manager m = new Manager();
        m.name = "Rrrrr";
        m.phone = "9876543210";
        m.address = " Street city State";
        m.salary = 18000;
        m.age = 3;
        e.print();
        m.print();

   }
}