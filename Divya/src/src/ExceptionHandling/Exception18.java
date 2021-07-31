 package ExceptionHandling;

public class Exception18 {
    int n;

    public static void student(int marks) {
        if (marks < 0 || marks > 100)
              throw new IllegalArgumentException(Integer.toString(marks));
        else
            System.out.println(marks);
    }

    public static void main(String[] args) {
        try {
            Exception18 e1 = new Exception18();
            e1.student(-1);
            System.out.println(e1.n);
            Exception18 e2 = new Exception18();
            e2.student(200);
            System.out.println(e2.n);
        }catch(IllegalArgumentException ie){
            System.out.println("illegal argument exception occured: ");
        }
    }
}