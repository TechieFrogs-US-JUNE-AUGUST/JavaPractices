//TO HANDLE CLONENOTSUPPORT EXCEPTION
package ExceptionHandling_Assignment;

class Name{
    String s;
    public Name(String s){                               //method
        super();                                         //constructor
        this.s= s;
    }
    public String toString(){                             //returns string representation of the object
        return "Name[s= " + s + "]";
    }
    public Object clone() throws CloneNotSupportedException{        //throwing an exception 
        return super.clone();
    }
}
public class Prog16 {
    public static void main(String[] args) {
         Name obj= new Name("Sravya");               //creating instance for the subclass by passing arguments
         System.out.println(obj);
         try {
             Name obj2= (Name)obj.clone();            //CloneNotSupportedException will be thrown because Name class didn't implement cloneable interface
             System.out.println(obj2);
         } 
         catch (CloneNotSupportedException cnse) {        //exception is handled here
            cnse.printStackTrace();
        }
    }
}

