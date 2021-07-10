package oops;

class Student {
    String name;
    int roll_no;
}

public class CreateAClass1{
   public static void main(String[] args) {
       Student st = new Student();
        st.name="John";
        st.roll_no=2;
        System.out.println("Student name :" +st.name );
        System.out.println("Student Roll No " +st.roll_no);
        
    } 
}