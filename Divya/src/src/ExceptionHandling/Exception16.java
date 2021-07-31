package ExceptionHandling;
class students{
    private String name;
    public students(String name)
    {
        super();
        this.name = name;
    }

    public String toString()
    {
        return "students[Name= " + name + "]";
    }
    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class Exception16
{
    public static void main(String[] args)
    {
        students s1 = new students("divya");// creating instance of class Employee
        System.out.println(s1);
// clone() method means that object cloning refers to the creation of an exact copy of an object
        try {
            students s2 = (students)s1.clone(); // Exception will be thrown because student class not immplementd
            System.out.println(s2);                     // clonable interface
        }catch (CloneNotSupportedException ce) {
            ce.printStackTrace();
        }
    }
}