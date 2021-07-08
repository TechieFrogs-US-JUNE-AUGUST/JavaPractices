//Method overloading
/* class Cars{
    String Suzuki(int x, String name){
      System.out.println("In class Car");
      return "Brezza";
    }
    //String Suzuki(String name,int x){
        int Suzuki(String name,int x){
       // return "Ritz";
       return x;
    }
}
public class Polymorphism {
    public static void main(String[] args){
      Cars subobj=new Cars();
      subobj.Suzuki(10,"swift");    //it will go to first method as we passed int,string
    }
}     */



//operator overloading
/*class Cars{
  //  String Suzuki(String x, int y){
      String Suzuki(String x,String y){
      System.out.println("In class Car");
      return x+y;
    }
       int Suzuki(int x,int y){
       return x+y;
    }
}
public class Polymorphism {
    public static void main(String[] args){
      Cars subobj=new Cars();
      int a=subobj.Suzuki(10,20);               //'+' operator here adds the 10,20 and gives 30
      System.out.println(a);
      String s=subobj.Suzuki("V ","K");        //'+' here concatenates here and prints side by side
      System.out.println(s);
    }
}    */


//Type promotion
class Cars{
     long Suzuki(long x, long y,long z){
      System.out.println("In class Car");
      return x+y+z;
    }
        
    //long Suzuki(long x,int y){      //int is converted to long and gives o/p
        double Suzuki(double d, int y){
       return d+y;
    }
void display(){
    System.out.println("In parent class method for method over riding");
}
}
public class Polymorphism {
    public static void main(String[] args){
      Cars subobj=new Cars();
     // subobj.Suzuki(1,2,3);
      subobj.Suzuki(1.5,20); 
    }
}

