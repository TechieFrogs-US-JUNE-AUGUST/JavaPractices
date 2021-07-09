
class Degree{
    void getDegree(){
        System.out.println("I got a Degree");
    }
  }
    class UnderGraduate extends Degree{
            void graduate(){
                System.out.println("I am an Undergraduate");
            }
        }
        class PostGraduate extends Degree{
            void graduate(){
                System.out.println("I am  a postgraduate");
            }
        }
public class DegreeInfo{
    public static void main(String[] args) {
        Degree obj = new Degree();
        obj.getDegree();
        UnderGraduate myobj1=new UnderGraduate();
        myobj1.graduate();
        PostGraduate myObj2=new PostGraduate();
        myObj2.graduate();
        
    }
}
