 class Student
{
    int roll_no=2;
    String name= "john";
    void display()
    {
        System.out.println("name is " +name);
    }
     public static void main (String[] args)
      {
        Student Obj = new Student();
        System.out.println("roll no is " +Obj.roll_no);
       Obj.display();
      }
}