package Interface;

import Abstractclass.Student;

class Interface implements Student{
@Override
    public void Name() {
        System.out.println("Name : Manogna");
    }

   
    public void Department() {

        System.out.println("Department : ECE");
        
    }

   
    public void rollno() {
       
        System.out.println("Roll Number : 19");
    }
    
}

public class Interface3 {
    public static void main(String[] args) {
        Interface  interfaceObj = new Interface();
        interfaceObj.Name();
        interfaceObj.Department();
        interfaceObj.rollno();
    }
    
}
