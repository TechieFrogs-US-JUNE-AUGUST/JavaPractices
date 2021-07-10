package Methods;

 class Degree {
     void  getDegree(){
        System.out.println("I got a degree");
    }
}   
    class Undergraduate extends Degree{
         void getDegree(){
            System.out.print("I am an Undergraduate");
        }
}
    class Postgraduate extends Degree{
        void getDegree(){
System.out.print("I am a PostGraduate");
        }
       }
class AddDegree{
 public static void main(String[] args){
     Degree degree = new Degree();
     degree.getDegree();
     Undergraduate undergraduate = new Undergraduate();
 undergraduate.getDegree();
 Postgraduate postgraduate = new Postgraduate();
postgraduate.getDegree();
 }
}