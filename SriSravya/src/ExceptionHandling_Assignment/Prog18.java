//TO HANDLE ILLEGALARGUMENT EXCEPTION
package ExceptionHandling_Assignment;

public class Prog18 {
    int m;
    public void setMarks(int marks){
        if(marks<0 || marks>100)
            throw new IllegalArgumentException(Integer.toString(marks));      //creating custom exception and throwing IllegalArgument exception
        else
        m= marks;
    }
    public static void main(String[] args) {
        Prog18 s1= new Prog18();                                             //creating instance
        s1.setMarks(45);                                                    //calling method by passing i/p value using instance obj
        System.out.println(s1.m);
        Prog18 s2= new Prog18();
        s2.setMarks(105);
        System.out.println(s2.m);
    }
}
