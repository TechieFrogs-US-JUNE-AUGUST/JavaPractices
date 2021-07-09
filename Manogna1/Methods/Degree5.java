package Methods;

   class Degree{

    void getDegree(){
        System.out.println("I Got A Degree");
    }
}

     class UnderGraduate {
    
        void underGraduate(){
            System.out.println("I am an UnderGraduate");
        }
   
}
    
    class PostGraduate
    {
        void postGraduate(){
            System.out.println("I am a PostGraduate");
        }
    }



public class Degree5 {
    public static void main(String[] args) {
        Degree d=new Degree(); 
         UnderGraduate ug= new UnderGraduate();
         PostGraduate pg = new PostGraduate();
         d.getDegree();
         ug.underGraduate();
         pg.postGraduate();
    

    }
    
}
