class Person{
    int salary=25000;
}

class Person4{
    void Name4(){
        System.out.println("Name is Cathy");
    }
}
public class Inheritance extends Person {
    int age=18;
    public static void main(String[] args){
        Inheritance i=new Inheritance();
        System.out.println("Inheritance age " +i.age);
        System.out.println("Person salary "+i.salary);
    }   
}


