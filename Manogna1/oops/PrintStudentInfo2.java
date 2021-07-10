package oops;

class Student1{
    String name;
    int rollno;
    int phoneno;
    String address;  
}
public class PrintStudentInfo2 {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.name="Sam";
        st1.rollno=5;
        st1.phoneno=12345;
        st1.address="Andhra";
        System.out.println("name is" +st1.name);
        System.out.println("rollno is " +st1.rollno);
        System.out.println("phonenumber is " +st1.phoneno);
        System.out.println("address is " +st1.address);
        Student1 st2 = new Student1();
        st2.name="John";
        st2.rollno=1;
        st2.phoneno=54321;
        st2.address="Telangana";
        System.out.println("name is" +st2.name);
        System.out.println("rollno is " +st2.rollno);
        System.out.println("phoneno is " +st2.phoneno);
        System.out.println("Address is " +st2.address);
    }

    
}
