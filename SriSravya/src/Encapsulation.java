public class Encapsulation {
    //private static int age;
    static int age;
    //int age=18;
     int getAge(){             //accessor or get method for age to access private variable
        return age;
    }   
       public void setAge(int age){ 
     //private void setAge(int age){     //mutator or set method for age 
        this.age=age;
    }
    public static void main(String[] args){
        Encapsulation obj=new Encapsulation();
        obj.setAge(21);
        System.out.println("Person age is: " +obj.getAge());
        //System.out.println("Person age is: " +obj.Age());        //due to encapsulation method obj.age doesn't work
    }
}     
