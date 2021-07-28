package StringAssignments;

public class CompareStringObjectUsingEquals3 
{
    public static void main(String[] args)
  {
    String student1 = "Nandu";
    String student2 = "Nandu";
    String student3 = new String("mohan");
    System.out.println(student1==student2);
    System.out.println(student1==student3);
  }
}
