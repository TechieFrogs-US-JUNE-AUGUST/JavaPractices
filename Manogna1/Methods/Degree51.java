package Methods;



class Degree1{

    void getDegree(){
        System.out.println("I Got A Degree");
    }
}

     class UnderGraduate1 extends Degree1 {
    
        void getDegree(){
            System.out.println("I am an UnderGraduate");
        }
   
}
    
    class PostGraduate1 extends Degree1
    {
        String getDegree(String s)
        {
          return s;
        }
    }

public class Degree51 {
    public static void main(String[] args) {
        Degree1 cs=new Degree1();
        cs.getDegree();
        UnderGraduate1 ug=new UnderGraduate1();
        ug.getDegree();
        PostGraduate1 pg=new PostGraduate1();
        pg.getDegree("I am a PostGraduate");
  }
    
}
