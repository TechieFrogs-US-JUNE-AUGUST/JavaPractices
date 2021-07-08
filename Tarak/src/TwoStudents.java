class Student1{
    String name;
    int rollno;
    int phno;
    String address;
}
public class TwoStudents {
    public static void main(String[] args) {
        Student1 obj1=new Student1();
        Student1 obj2=new Student1();
        obj1.name="sam";
        obj1.rollno=1;
        obj1.phno=123645;
        obj1.address="India";
        System.out.println("name is "+obj1.name);
        System.out.println("roll no is "+obj1.rollno);
        System.out.println("ph no is "+obj1.phno);
        System.out.println("address is "+obj1.address);
        obj2.name="john";
        obj2.rollno=2;
        obj2.phno=6847184;
        obj2.address="USA";
        System.out.println("name is "+obj2.name);
        System.out.println("roll no is "+obj2.rollno);
        System.out.println("ph no is "+obj2.phno);
        System.out.println("address is "+obj2.address);
    }
    
}
