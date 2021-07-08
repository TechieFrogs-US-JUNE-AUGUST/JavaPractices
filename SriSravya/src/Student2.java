class Sam{                              //subclass
    Sam(int r, String s, int p,String a){              //parameterized constructor
        System.out.println("roll_num is " +r + "  and name is "+s+"  and ph_no is "+p+ " and address is " +a);
    }
}
class John{
    John(int r, String s, int p,String a){
        System.out.println("roll_num is " +r + "  and name is "+s+"  and ph_no is "+p+ " and address is " +a);
    }
}


public class Student2 {

    public static void main(String[] args){
        Sam obj1=new Sam(71,"Sam",12345,"Sam Villa");
        John obj2=new John(21,"John",67890,"John Villa");
       
     }
}
