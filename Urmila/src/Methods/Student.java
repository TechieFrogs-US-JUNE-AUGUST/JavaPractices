package Methods;
import java.util.Scanner;
public class Student {
    int age;
    String name;
    String Address;
public Student(){
    this.name = "Unknown";// to refer current class instance variable
    this.age = 0;
    this.Address ="NotAvailable";
}
void setInfo(int age, String name){// method declaration using set-method
    this.name = name;
    this.age = age;
}
void setInfo(int age,String name,String Address){
    this.name = name;
    this.age = age;
    this.Address = Address;
}
}
class AddStudent{
    public static void main(String[] args){// calling methods or print output
        int x = 10;
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of student" );
for (int y = 1;y <= x; y++){
    System.out.println("Enter the Details of Student" + y);
    System.out.println("name =");
    String name = sc.next();
    System.out.println("age = ");
    int age = sc.nextInt();
    System.out.println("Address = ");
    String Address = sc.next();
}
    }
}