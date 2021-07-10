package Methods;
//import java.util.Scanner;
public class Student 
{
      String name;
      int age;
      String address;
    Student()
    {
         name="unknown";
         age=0;
         address="not available";
    }
    void setinfo(String name, int age)
    {
      this.name=name;                //  can not this in static 
      this.age=age;
    }
    void setinfo(String name, int age, String address)
    {
        this.name=name;
        this.age = age;
        this.address = address;
    }
    public static void main( String[] args)
      {
        /*//int i=10;   
       // Student Obj = new Student();
        Scanner Obj = new Scanner(System.in);
       for(int i=1; i<=10;i++)                                              // 10 students details can be entered through keyboard.
        {
            System.out.println("student details of " +i);
            System.out.println("name is");
            String name = Obj.next();
            System.out.println("age is ");
            int age = Obj.nextInt();
            System.out.println("address is");
            String address= Obj.next();      
        }
        Obj.close();*/
        System.out.println("student1 name is one");
        System.out.println("student1 age is 1");                          // 10 students can be printed directly.
        System.out.println("student1 address is ABC");
      }
 }