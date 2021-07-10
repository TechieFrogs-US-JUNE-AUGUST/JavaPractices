package Methods;

import java.util.Scanner;

class Student
{
    String name;
    int age;
    String address;

     Student()
     {
         this.name="unknown";
         this.age=0;
         this.address="NotAvailable";
     }
     void setInfo(String name,int age)
     {
         this.name=name;
         this.age=age;
     }
     void setInfo(String name,int age,String address)
     {
         this.name=name;
         this.age=age;
         this.address=address;
     }


}

public class StudentInfo4 {
    public static void main(String[] args) {
        
        int j=10;
        Student s=new Student();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Details of Students ");
       for(int i=1;i<=j;i++)
        {
            System.out.println("Enter details of Student " +i);
            System.out.println("Name " );
            String name=sc.next();
            System.out.println("age ");
            int age =sc.nextInt();
            System.out.println("address ");
            String address = sc.next();

        }


    }
    
}
