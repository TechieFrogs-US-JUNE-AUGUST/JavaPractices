public class ReferenceTypeCasting {
    public static void main(String[] args){
        Cat catObj = new Cat();
        Animal animalObj = catObj;
        animalObj.eat();
        //animalObj.catM();//we can not,we need to downcasting here
        ((Cat)(animalObj)).eat(); // Down Csting a method
        if(animalObj instanceof Cat){// if we dont have that particular method,it give TypeCastingExceptiom
            ((Cat)(animalObj)).eat();// For not getting TypeCastingEsception we use if.
        }
        
    }
}
class Animal{
    void eat(){
        System.out.println("From animal eat");
    }
}
class Cat extends Animal{
    void catM(){
        System.out.println("From catM");
    }
    void eat(){
        System.out.println("From cat eat , override");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("From dog eat, override");
    }
    void dogM(){
        System.out.println("From dogM");
    }
}