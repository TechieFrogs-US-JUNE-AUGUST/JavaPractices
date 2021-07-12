package AbstractClass_Assignment;
abstract class Marks{               //abstract class
    abstract float getPercentage();
}
class A extends Marks{              //subclass with inheritance
    float s1,s2,s3;
    float per=0;

    A(float a,float b,float c){         //constructor
        this.s1=a;
        this.s2=b;
        this.s3=c;
    }
    public float getPercentage(){    //overriden method
        per=(s1+s2+s3)/300*100;
        return per;
    }
}
class B extends Marks{                  //subclass with inheritance    
    float s1,s2,s3,s4;
    float per=0;
    
    B(float a,float b, float c, float d){       //constructor with parameters
        this.s1=a;
        this.s2=b;
        this.s3=c;
        this.s4=d;
    }
    public float getPercentage(){               //overridden method
        per=(s1+s2+s3+s4)/400*100;
        return per;
    }
}
public class Ass4Prog3 {
   public static void main(String[] args){
     B obj2=new B(40f,50f,60f,70f);     //creating obj for student B by passing with parameters to the constructor
     A obj1=new A(60f,70f,80f);
    System.out.println("A percentage is: " +obj1.getPercentage());             //displaying and calling method to get the percentage of student A
    System.out.println("B percentage is: " +obj2.getPercentage());
   } 
}
