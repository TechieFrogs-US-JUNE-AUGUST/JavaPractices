package OOPS;

class Student
{
    String name;
    int roll_no;
    String pno;
    String address;
}
public class Createclass
{
    public static void main(String[] args) {
        Student st = new Student();
        st.name="John";
        st.roll_no=2;
        System.out.println("Student Name :" +st.name );
        System.out.println("Student Roll No : " +st.roll_no );
        
    }





}