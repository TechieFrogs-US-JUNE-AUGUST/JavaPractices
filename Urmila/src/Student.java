class Student
{
    int roll_no;
    String name;
}

 class Ans
 {
   public static void main(String [] args)
   {
    Student student = new Student();
    student.name = " John ";
    student.roll_no = 2;
    System.out.println("Name is " + student.name + "student roll number" + student.roll_no );
    }
}