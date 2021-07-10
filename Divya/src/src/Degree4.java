class Degree1 {
     void getDegree() {
         System.out.println("i got a degree");
     }
 }
    class Undergraduate extends Degree1 {
            void graduate(){
                System.out.println("iam undergraduate");
            }
        }
        class Postgraduate extends Degree1 {
            void graduate() {
                System.out.println("iam postgraduate");
            }
        }
    public class Degree4{
    public static void main(String[] args){
        Degree1 obj1=new Degree1();
        Undergraduate obj2=new Undergraduate();
        Postgraduate obj3=new Postgraduate();
        obj1.getDegree();
        obj2.graduate();
        obj3.graduate();
    }
}
